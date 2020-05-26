package com.lamda.web.services;

import com.lamda.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface PlayerService {
    public List<PlayerDTO> retriveAll();
}
