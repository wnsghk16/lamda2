package com.lamda.web.serviceImpls;

import com.lamda.web.mappers.OWPlayerMapper;
import com.lamda.web.music.OWPlayerDTO;
import com.lamda.web.services.OWPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OWPlayerServiceImpl implements OWPlayerService {
    @Autowired
    OWPlayerMapper owPlayerMapper;

    @Override
    public List<OWPlayerDTO> retriveAll() {
        return owPlayerMapper.selectAll();
    }
}
