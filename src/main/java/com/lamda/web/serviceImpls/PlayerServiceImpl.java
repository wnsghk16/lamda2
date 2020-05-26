package com.lamda.web.serviceImpls;

import com.lamda.web.domains.PlayerDTO;
import com.lamda.web.mappers.PlayerMapper;
import com.lamda.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerMapper playerMapper;

    @Override
    public List<PlayerDTO> retriveAll() {
        return playerMapper.selectAll();
    }
}
