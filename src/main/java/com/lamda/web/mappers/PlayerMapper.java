package com.lamda.web.mappers;

import com.lamda.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public List<PlayerDTO> selectAll();
}
