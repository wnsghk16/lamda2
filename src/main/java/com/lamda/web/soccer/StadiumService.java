package com.lamda.web.soccer;

import com.lamda.web.music.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {
    @Autowired StadiumRepository stadiumRepository;
}
