package com.Music.Moodi.Repository;

import com.Music.Moodi.Entity.RelefSongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelefSongsRepository extends JpaRepository<RelefSongs, Long> {
}
