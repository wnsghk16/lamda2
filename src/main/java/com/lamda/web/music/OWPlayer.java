package com.lamda.web.music;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Lazy
public class OWPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owplayerNo;
    @Column(length = 500, nullable = false)
    private String playerpic;
    @Column(length = 200, nullable = false)
    private String player;
    @Column(length = 200, nullable = false)
    private String name;
    @Column(length = 200, nullable = false)
    private String hometown;
    @Column(length = 500, nullable = false)
    private String teampic;
    @Column(length = 200, nullable = false)
    private String team;
    @Column(length = 500, nullable = false)
    private String roleicon;
    @Column(length = 200, nullable = false)
    private String role;

    @Builder
    public OWPlayer(String playerpic, String player, String name,
                 String hometown, String teampic, String team,
                    String roleicon, String role) {
        this.playerpic = playerpic;
        this.player = player;
        this.name = name;
        this.hometown = hometown;
        this.teampic = teampic;
        this.team = team;
        this.roleicon = roleicon;
        this.role = role;
    }
}
