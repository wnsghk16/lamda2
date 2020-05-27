package com.lamda.web.soccer;

import javax.validation.constraints.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="schedule")
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleNo;
    @NotNull @Column(length = 10)
    private String scheDate;
    @NotNull @Column(length = 10)
    private String gubun;
    @NotNull @Column(length = 10)
    private String hometeamId;
    @NotNull @Column(length = 10)
    private String awayteamId;
    @Column(length = 10)
    private String homeScore;
    @Column(length = 10)
    private String awayScore;

    @Builder
    public Schedule(String scheDate,String gubun,
                  String hometeamId,String awayteamId,String homeScore,String awayScore){
        this.scheDate = scheDate;
        this.gubun = gubun;
        this.hometeamId = hometeamId;
        this.awayteamId = awayteamId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id") @NotNull
    private Stadium stadium;
}
