package com.lamda.web.services;

import com.lamda.web.domains.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    public List<UserDTO> retriveAll();
}
