package com.Music.Moodi.Service.Impl;

import com.Music.Moodi.Controller.RelefSongs;
import com.Music.Moodi.Entity.HappySongs;
import com.Music.Moodi.Repository.RelefSongsRepository;
import com.Music.Moodi.Service.RelefSongsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RelefSongsServiceImpl implements RelefSongsService {

    private RelefSongsRepository relefSongsRepository;





    @Override
    public RelefSongsService createRelefSongs(RelefSongsService relefSongsService) {
        return null;
    }
}
