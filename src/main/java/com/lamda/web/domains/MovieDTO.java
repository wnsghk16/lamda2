package com.lamda.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MovieDTO {
    private String seq, rank, title, rankDate;
}
