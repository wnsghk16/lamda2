package com.lamda.web.music;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
//@NoArgsConstructor(access = AccessLevel.PUBLIC)
//@Component
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
    public Movie(){}

    public Long getMovieNo() {
        return movieNo;
    }

    public void setMovieNo(Long movieNo) {
        this.movieNo = movieNo;
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

    public String getRankDate() {
        return rankDate;
    }

    public void setRankDate(String rankDate) {
        this.rankDate = rankDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieNo=" + movieNo +
                ", seq='" + seq + '\'' +
                ", title='" + title + '\'' +
                ", rankDate='" + rankDate + '\'' +
                '}';
    }
}
