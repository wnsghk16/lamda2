package com.lamda.web.music;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MusicDTO {
    private String musicNo, seq, title, artists, thumbnail;
}
