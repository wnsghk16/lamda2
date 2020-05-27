package com.lamda.web.soccer;

import com.lamda.web.music.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Music,Long> {
}
