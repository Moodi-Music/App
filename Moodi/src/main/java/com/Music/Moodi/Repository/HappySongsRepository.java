package com.Music.Moodi.Repository;

import com.Music.Moodi.Entity.HappySongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappySongsRepository extends JpaRepository<HappySongs, Long> {


}
