package com.lamda.web.music;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class OWPlayerDTO {
    private String id,
            playerimg,
            player,
            name,
            hometown,
            teamimg,
            team,
            role;
}
