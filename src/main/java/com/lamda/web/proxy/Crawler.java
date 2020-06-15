package com.lamda.web.proxy;

import com.lamda.web.music.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

@Component("crawler") @Lazy
public class Crawler extends Proxy{
    @Autowired Inventory<Music> inventory;
    @Autowired Box<String> box;
    @Autowired MusicRepository musicRepository;
    @Autowired MovieRepository movieRepository;
    @Autowired OWPlayerRepository owPlayerRepository;

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
            Elements arr = d.select("div.tit3");
            Elements date = d.select("p.r_date");
            Movie movie = null;
            for(int i=0;i < arr.size(); i++){
                movie = new Movie();
                movie.setSeq(string(i+1));
                movie.setTitle(arr.get(i).text());
                movie.setRankDate(date.get(0).text()); //날짜는 하나뿐이기때문에 0번째꺼만 가져오면됨
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
            String url = "https://overwatchleague.com/en-us/players";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements player = d.select("a.players-liststyles__PlayerCard-sc-1jhwo3g-21 VGXqA table-cardstyles__Player-sc-2s08up-0 cEZKBC");
            Elements name = d.select("a.players-liststyles__Link-sc-1jhwo3g-14 CQTPb");
            Elements hometown = d.select("div.players-liststyles__HometownCell-sc-1jhwo3g-8 ghvQQY table-cellstyles__Container-sc-1k1ivbt-0 gtVrBZ");
            Elements team = d.select("a.players-liststyles__TeamCard-sc-1jhwo3g-22 gzyPNZ table-cardstyles__Player-sc-2s08up-0 cEZKBC");
            Elements role = d.select("a.players-liststyles__RoleCell-sc-1jhwo3g-10 FCRbg table-cellstyles__Container-sc-1k1ivbt-0 jUsODt");
            OWPlayer owPlayer = null;
            for(int i=0;i < name.size(); i++){
                owPlayer = new OWPlayer();
                owPlayer.setPlayer(player.get(i).text());
                owPlayer.setPlayerpic(player.get(i).select("img").attr("src"));
                owPlayer.setName(name.get(i).text());
                owPlayer.setHometown(hometown.get(i).text());
                owPlayer.setTeampic(team.get(i).select("img").attr("src"));
                owPlayer.setTeam(team.get(i).text());
                owPlayer.setRoleicon(role.get(i).select("img").attr("src"));
                owPlayer.setRole(role.get(i).text());

                print("******************** djdjd결과 *****************\n");
                print(owPlayer.toString());

                owPlayerRepository.save(owPlayer);
            }
        }catch(Exception e){
            print("에러 발생");
        }
        print("******************** 선수 크롤링 결과 *****************\n");
        //inventory.get().forEach(System.out::print);
        //print(inventory.get().get(0).toString());
    }
}
