package com.lamda.web.mappers;

import com.lamda.web.domains.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<UserDTO> selectAll();
}
