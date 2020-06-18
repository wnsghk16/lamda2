package com.lamda.web.music;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Component
@Entity
@Lazy
public class Lol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lolNo;
    @Column(length = 4)
    private String rank;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String win;
    @Column(length = 100)
    private String lose;
    @Column(length = 100)
    private String point;
    @Builder
    public Lol(String rank, String name, String win,
               String lose, String point) {
        this.rank = rank;
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.point = point;
    }
}
