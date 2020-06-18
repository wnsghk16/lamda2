package com.lamda.web.services;

import com.lamda.web.music.OWTeamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OWTeamService {
    public List<OWTeamDTO> retriveAll();
}
