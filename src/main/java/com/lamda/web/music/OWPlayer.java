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
@ToString
public class OWPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owplayerNo;
    @Column(length = 200, nullable = false)
    private String id;
    @Column(length = 200, nullable = false)
    private String player;
    @Column(length = 500, nullable = false)
    private String playerimg;
    @Column(length = 200, nullable = false)
    private String name;
    @Column(length = 200, nullable = false)
    private String hometown;
    @Column(length = 500, nullable = false)
    private String teamimg;
    @Column(length = 200, nullable = false)
    private String team;
    @Column(length = 200, nullable = false)
    private String role;

    @Builder
    public OWPlayer(String id, String playerimg, String player, String name,
                 String hometown, String teamimg, String team, String role) {
        this.id = id;
        this.playerimg = playerimg;
        this.player = player;
        this.name = name;
        this.hometown = hometown;
        this.teamimg = teamimg;
        this.team = team;
        this.role = role;
    }
}
