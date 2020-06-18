package com.lamda.web.mappers;

import com.lamda.web.music.OWTeamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OWTeamMapper {
    public List<OWTeamDTO> selectAll();
}
