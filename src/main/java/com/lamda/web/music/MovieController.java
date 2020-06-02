package com.lamda.web.music;

import com.lamda.web.mappers.MovieMapper;
import com.lamda.web.proxy.Box;
import com.lamda.web.proxy.IFunction;
import com.lamda.web.proxy.Pager;
import com.lamda.web.proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/movie")
public class MovieController{
    @Autowired Pager pager;
    @Autowired MovieMapper movieMapper;
    @Autowired Proxy pxy;
    @Autowired Box<Object> box;
    @GetMapping("/{searchWord}/{pageNumber}")
    public Map<?,?> list(@PathVariable("searchWord") String searchWord,
                         @PathVariable("pageNumber") String pageNumber){
        if(searchWord.equals("")){//서치워드가 없으면
            pxy.print("검색어가 없음");
        }else{
            pxy.print("검색어가 " + searchWord);
        }
        pager.setPageNow(pxy.integer(pageNumber));
        pager.setBlockSize(5);
        pager.setPageSize(5);
        pager.paging();
        IFunction<Pager,List<MovieDTO>> f = p-> movieMapper.selectMovies(p);
        List<MovieDTO> l = f.apply(pager);
        pxy.print("******************");
        for(MovieDTO m : l){
            pxy.print(m.toString());
        }
        box.clear();
        box.put("pager",pager);
        box.put("list",l);
        return box.get();
    }
}
