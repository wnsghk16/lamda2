package com.lamda.web.services;

import com.lamda.web.music.OWPlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OWPlayerService {
    public List<OWPlayerDTO> retriveAll();

}
