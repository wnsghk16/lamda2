package com.lamda.web.music;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Component
@Entity
@Lazy
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieNo;
    @Column(length = 4)
    private String seq;
    @Column(length = 100)
    private String title;
    @Column(length = 10)
    private String rankDate;
    @Builder
    public Movie(String seq, String title, String rankDate) {
        this.seq = seq;
        this.title = title;
        this.rankDate = rankDate;
    }
}
