package com.lamda.web.proxy;

import com.lamda.web.music.*;
import com.lamda.web.serviceImpls.OWPlayerServiceImpl;
import com.lamda.web.serviceImpls.OWTeamServiceImpl;
import com.lamda.web.services.OWPlayerService;
import com.lamda.web.services.OWTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
public class ProxyController{
    @Autowired Box<Object> box;
    @Autowired Crawler crawler;
    @Autowired Proxy pxy;
    @Autowired FileUploader uploader;
    @Autowired Inventory<HashMap<String, String>> inventory;
    @Autowired MusicRepository musicRepository;
    @Autowired MovieRepository movieRepository;
    @Autowired OWPlayerRepository owPlayerRepository;
    @Autowired OWTeamServiceImpl owTeamService;
    @Autowired LolRepository lolRepository;

    @GetMapping("/navermovie/{searchWord}")
    public HashMap<String,Object> navermovie(@PathVariable String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        if(movieRepository.count() == 0) crawler.naverMovie();
        List<Movie> list = movieRepository.findAll();
        box.put("list", list);
        box.put("count", list.size());
        return box.get();
    }
    @GetMapping("/owplayer/{searchWord}")
    public HashMap<String,Object> owplayers(@PathVariable String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        if(owPlayerRepository.count() == 0){
            crawler.owPlayer();
        }
        List<OWPlayer> list = owPlayerRepository.findAll();
        pxy.print(owPlayerRepository.findAll().toString());
        box.put("list", list);
        box.put("count", list.size());
        return box.get();
    }
    @PostMapping("/bugsmusic")
    public HashMap<String,Object> bugsmusic(@RequestBody String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        if(musicRepository.count() == 0){
            crawler.bugsMusic();
        }
        List<Music> list = musicRepository.findAll();
        box.put("list", list);
        box.put("count", list.size());
        return box.get();

    }

    @GetMapping("/soccer/{searchWord}")
    public HashMap<String,Object> soccer(@PathVariable String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        uploader.upload();
        return null;
    }

    @PostMapping("/owteam")
    public HashMap<String,Object> owteams(@RequestBody String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        List<OWTeamDTO> list = owTeamService.retriveAll();
        box.put("list", list);
        box.put("count", list.size());
        return box.get();

    }

    @PostMapping("/lolrank")
    public HashMap<String,Object> lolranking(@RequestBody String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        if(lolRepository.count() == 0){
            crawler.lolRanking();
        }
        List<Lol> list = lolRepository.findAll();
        pxy.print(lolRepository.findAll().toString());
//        List<OWPlayerDTO> list = owPlayerService.retriveAll();
        box.put("list", list);
        box.put("count", list.size());
        return box.get();

    }

}
