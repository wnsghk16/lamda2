package com.lamda.web.music;

import lombok.*;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicNo;
    @Column(length = 4, nullable = false)
    private String seq;
    @Column(length = 30, nullable = false)
    private String title;
    @Column(length = 30, nullable = false)
    private String artists;
    @Column(length = 200, nullable = false)
    private String thumbnail;
    @Builder
    public Music(String seq, String title, String artists,
                 String thumbnail) {
        this.seq = seq;
        this.title = title;
        this.artists = artists;
        this.thumbnail = thumbnail;
    }

}
