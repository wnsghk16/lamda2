package com.lamda.web.navermovie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
//@NoArgsConstructor(access = AccessLevel.PUBLIC)
//@Component
@Entity(name="movie")
@Lazy
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicNo;
    @Column(length = 4, nullable = false)
    private String seq;
    @Column(length = 500, nullable = false)
    private String title;
    @Builder
    public Movie(String seq, String title, String artists,
                 String thumbnail) {
        this.seq = seq;
        this.title = title;
    }
    public Movie(){}
    public Long getMusicNo() {
        return musicNo;
    }

    public void setMusicNo(Long musicNo) {
        this.musicNo = musicNo;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "musicNo=" + musicNo +
                ", seq='" + seq + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
