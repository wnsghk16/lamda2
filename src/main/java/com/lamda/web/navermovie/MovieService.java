package com.lamda.web.navermovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired MovieRepository movieRepository;
}
