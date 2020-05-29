package com.lamda.web.mappers;

import com.lamda.web.domains.MovieDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieMapper {
    public void insertMovie();
    public void updateMovie();
    public void deleteMovie();
    public List<MovieDTO> selectMovies();
    public MovieDTO selectMovie(String movieName);
    public int count();
}
