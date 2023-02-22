package com.Music.Moodi.Service.Impl;

import com.Music.Moodi.Entity.ReliefSongs;
import com.Music.Moodi.Repository.ReliefSongsRepository;
import com.Music.Moodi.Service.ReliefSongsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReliefSongsServiceImpl implements ReliefSongsService {

    private ReliefSongsRepository reliefSongsRepository;


    @Override
    //return the saved reliefSongs in the database
    public ReliefSongs createReliefSongs(ReliefSongs reliefSongs) {
        return reliefSongsRepository.save(reliefSongs);
    }

    @Override
    public List<ReliefSongs> getAllReliefSongs() {
        return reliefSongsRepository.findAll();
    }

    @Override
    public ReliefSongs updateReliefSongs(ReliefSongs reliefSongs) {
        ReliefSongs savedReliefSongs = reliefSongsRepository.findById(reliefSongs.getId()).get();
        savedReliefSongs.setSongName(reliefSongs.getSongName());
        //saved songs by artist name
        savedReliefSongs.setArtistName(reliefSongs.getArtistName());
        //saved songs by song url
        savedReliefSongs.setSongUrl(reliefSongs.getSongUrl());

        //Update the saved songs in the database
        ReliefSongs updatedReliefSongs = reliefSongsRepository.save(savedReliefSongs);
        return updatedReliefSongs;


    }


}
