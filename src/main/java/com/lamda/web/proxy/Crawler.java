package com.lamda.web.proxy;

import com.lamda.web.music.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Iterator;
import java.util.Map;

@Component("crawler") @Lazy
public class Crawler extends Proxy{
    @Autowired Inventory<Music> inventory;
    @Autowired Box<String> box;
    @Autowired MusicRepository musicRepository;
    @Autowired MovieRepository movieRepository;
    @Autowired OWPlayerRepository owPlayerRepository;
    @Autowired LolRepository lolRepository;

    public void bugsMusic(){
        inventory.clear();
        try{
            String url = "https://music.bugs.co.kr/chart";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("p.title");
            Elements artist = d.select("p.artist");
            Elements thumbnail = d.select("a.thumbnail");
            Music music = null;
            for(int i=0;i < title.size(); i++){
                music = new Music();
                music.setSeq(string(i+1));
                music.setTitle(title.get(i).text());
                music.setArtists(artist.get(i).text());
                music.setThumbnail(thumbnail.get(i).select("img").attr("src"));
                musicRepository.save(music);
            }
        }catch(Exception e){
            print("에러 발생");
        }
        print("******************** 크롤링 결과 *****************\n");
        //inventory.get().forEach(System.out::print);
        //print(inventory.get().get(0).toString());
    }

    public void naverMovie(){
        inventory.clear();
        try{
            String url = "https://movie.naver.com/movie/sdb/rank/rmovie.nhn";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("div.tit3");
            Elements rank = d.select("p.r_date");
            Movie movie = null;
            for(int i=0;i < title.size(); i++){
                movie = new Movie();
                movie.setSeq(string(i+1));
                movie.setTitle(title.get(i).text());
                movie.setRankDate(rank.get(0).text()); //날짜는 하나뿐이기때문에 0번째꺼만 가져오면됨
                movieRepository.save(movie);
            }
        }catch(Exception e){
            print("에러 발생");
        }
        print("******************** 크롤링 결과 *****************\n");
    }

    public void owPlayer(){
        inventory.clear();
        try{
            String url = "https://overwatchleague.com/ko-kr/players";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
//            print(d.toString());
//            Elements script = d.select("script#__NEXT_DATA__");
            Iterator<Element> ie = d.select("script#__NEXT_DATA__").iterator();
            String s = "";
            while (ie.hasNext()){
                s += ie.next().html();
//                System.out.println(ie.next().html());
            }

            JSONParser parser = new JSONParser();
            Object obj = parser.parse( s );
            JSONObject jsonObj = (JSONObject) obj;

            JSONObject a = (JSONObject) jsonObj.get("props");
//            System.out.println(a.toString());
            JSONObject b = (JSONObject) a.get("pageProps");
//            System.out.println(b.toString());
            JSONArray c = (JSONArray) b.get("blocks");
//            System.out.println(c.toString());
            JSONObject tmp = new JSONObject();
            JSONObject e = new JSONObject();
            for (int i = 0; i < c.size(); i++) {
                if(c.get(i).toString().contains("playerList")){
                    tmp = (JSONObject) c.get(i);
                    e = (JSONObject) tmp.get("playerList");
                }
            }
//            System.out.println(e.toString());
            JSONObject f = (JSONObject) e.get("tableData");
//            System.out.println(f.toString());
            JSONArray g = (JSONArray) f.get("data");
//            System.out.println(g.toString());

            OWPlayer owPlayer = null;
            for(int i=0;i < g.size(); i++){
                tmp = (JSONObject) g.get(i);
                owPlayer = new OWPlayer();
                owPlayer.setId(tmp.get("id").toString());
                owPlayer.setPlayer(tmp.get("name").toString());
                owPlayer.setPlayerimg(tmp.get("headshot").toString());
                owPlayer.setName(tmp.get("realName").toString());
                owPlayer.setHometown(tmp.get("hometown").toString());
                owPlayer.setTeamimg(tmp.get("teamImage").toString());
                owPlayer.setTeam(tmp.get("teamName").toString());
                owPlayer.setRole(tmp.get("role").toString());
                owPlayerRepository.save(owPlayer);
            }
        }catch(Exception e){
            print("에러 발생 "+e);
        }
        print("******************** 선수 크롤링 결과 *****************\n");
        inventory.get().forEach(System.out::print);
        print(inventory.get().get(0).toString());
    }

    public void lolRanking(){
        inventory.clear();
        try{
            String url = "http://lol.inven.co.kr/dataninfo/ladder/";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();

            Elements rank = d.select("span.league_rank");
            Elements name = d.select("span.summoner_name");
            Elements win = d.select("span.wins");
            Elements lose = d.select("span.losses");
            Elements point = d.select("span.league_points");
            Lol lol = null;
            for(int i=0;i < rank.size(); i++){
                lol = new Lol();
                lol.setRank(rank.get(i).text());
                lol.setName(name.get(i).text());
                lol.setWin(win.get(i).text());
                lol.setLose(lose.get(i).text());
                lol.setPoint(point.get(i).text());
                lolRepository.save(lol);
            }
        }catch(Exception e){
            print("에러 발생");
        }
        print("******************** 크롤링 결과 *****************\n");
    }
}
