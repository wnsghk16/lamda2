package com.lamda.web.serviceImpls;

import com.lamda.web.mappers.OWTeamMapper;
import com.lamda.web.music.OWTeamDTO;
import com.lamda.web.services.OWTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OWTeamServiceImpl implements OWTeamService {
    @Autowired
    OWTeamMapper owTeamMapper;

    @Override
    public List<OWTeamDTO> retriveAll() {
        return owTeamMapper.selectAll();
    }
}
