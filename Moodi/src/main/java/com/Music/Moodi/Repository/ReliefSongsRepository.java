package com.Music.Moodi.Repository;

import com.Music.Moodi.Controller.ReliefSongsController;
import com.Music.Moodi.Entity.ReliefSongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReliefSongsRepository extends JpaRepository<ReliefSongs, Long> {
}
