package com.MyMusic.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappySongs extends JpaRepository<HappySongs, Integer> {
}
