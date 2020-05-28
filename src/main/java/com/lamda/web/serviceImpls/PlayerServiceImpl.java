package com.lamda.web.serviceImpls;

import com.lamda.web.domains.UserDTO;
import com.lamda.web.mappers.UserMapper;
import com.lamda.web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements UserService {
    @Autowired
    UserMapper playerMapper;

    @Override
    public List<UserDTO> retriveAll() {
        return playerMapper.selectAll();
    }
}
