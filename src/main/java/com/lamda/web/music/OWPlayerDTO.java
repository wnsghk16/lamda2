package com.lamda.web.music;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class OWPlayerDTO {
    private String playerpic,
            player,
            name,
            hometown,
            teampic,
            team,
            roleicon,
            role;
}
