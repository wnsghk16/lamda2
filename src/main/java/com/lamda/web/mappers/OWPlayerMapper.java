package com.lamda.web.mappers;

import com.lamda.web.music.OWPlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OWPlayerMapper {
    public List<OWPlayerDTO> selectAll();
}
