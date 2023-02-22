package com.Music.Moodi.Service.Impl;

import com.Music.Moodi.Entity.HappySongs;
import com.Music.Moodi.Repository.HappySongsRepository;
import com.Music.Moodi.Service.HappySongsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class HappySongsServiceImpl implements HappySongsService {

    //Injections of our HappySongsRepository
    private HappySongsRepository happySongsRepository;


    @Override
    public HappySongs createHappySongs(HappySongs happySongs) {
        return happySongsRepository.save(happySongs);
    }

    @Override
    public List<HappySongs> getAllHappySongs() {
        return happySongsRepository.findAll();
    }

    @Override
    public HappySongs updateHappySongs(HappySongs happySongs) {
        return happySongsRepository.save(happySongs);
    }
}
