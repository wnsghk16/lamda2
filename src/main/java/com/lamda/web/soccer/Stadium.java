package com.lamda.web.soccer;

import javax.validation.constraints.NotNull;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Lazy
public class Stadium {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stadiumNo;
    @NotNull @Column(length = 10)
    private String stadiumId;
    @NotNull @Column(length = 40)
    private String stadiumName;
    @Column(length = 10)
    private String hometeamId;
    @NotNull @Column(length = 10)
    private String seatCount;
    @NotNull @Column(length = 60)
    private String address;
    @NotNull @Column(length = 10)
    private String ddd;
    @Column(length = 10)
    private String tel;

    @Builder
    public Stadium(String stadiumId,String stadiumName,String hometeamId,
                    String seatCount,String address,String ddd,String tel){
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.hometeamId = hometeamId;
        this.seatCount = seatCount;
        this.address = address;
        this.ddd = ddd;
        this.tel = tel;
    }

    @OneToMany(mappedBy = "stadiumOfTeam")
    private List<Team> teams;

    @OneToMany(mappedBy = "stadiumOfSchedule")
    private List<Schedule> schedules;
}

