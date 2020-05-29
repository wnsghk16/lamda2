package com.lamda.web.proxy;

import com.lamda.web.music.Music;
import com.lamda.web.music.MusicRepository;
import com.lamda.web.music.Movie;
import com.lamda.web.music.MovieRepository;
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



}
