package com.lamda.web.music;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MovieDTO {
    private String movieNo, seq, title, rankDate;
}
