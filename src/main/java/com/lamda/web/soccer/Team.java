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
//@Component
@Lazy
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamNo;
    @NotNull @Column(length = 10)
    private String teamId;
    @NotNull @Column(length = 10)
    private String regionName;
    @NotNull @Column(length = 40)
    private String teamName;
    @NotNull @Column(length = 50)
    private String eTeamName;
    @NotNull @Column(length = 10)
    private String origYyyy;
    @NotNull @Column(length = 10)
    private String zipCode1;
    @NotNull @Column(length = 10)
    private String zipCode2;
    @NotNull @Column(length = 80)
    private String address;
    @NotNull @Column(length = 10)
    private String ddd;
    @NotNull @Column(length = 10)
    private String tel;
    @NotNull @Column(length = 10)
    private String fax;
    @NotNull @Column(length = 50)
    private String homepage;
    @NotNull @Column(length = 10)
    private String owner;

    @Builder
    public Team(String teamId,String regionName,String teamName,
                  String eTeamName,String origYyyy,String zipCode1,
                  String zipCode2,String address,String ddd,
                  String tel,String fax,String homepage,String owner){
        this.teamId = teamId;
        this.regionName = regionName;
        this.teamName = teamName;
        this.eTeamName = eTeamName;
        this.origYyyy = origYyyy;
        this.zipCode1 = zipCode1;
        this.zipCode2 = zipCode2;
        this.address = address;
        this.ddd = ddd;
        this.tel = tel;
        this.fax = fax;
        this.homepage = homepage;
        this.owner = owner;
    }

    @OneToMany(mappedBy = "teamOfPlayer")
    private List<Player> players;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stadium_id") @NotNull
    private Stadium stadiumOfTeam;

}
