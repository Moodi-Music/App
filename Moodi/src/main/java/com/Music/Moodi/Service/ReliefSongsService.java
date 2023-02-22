package com.Music.Moodi.Service;

import com.Music.Moodi.Entity.ReliefSongs;

import java.util.List;

public interface ReliefSongsService {


    ReliefSongs createReliefSongs(ReliefSongs reliefSongsController);

    List<ReliefSongs> getAllReliefSongs();

    ReliefSongs updateReliefSongs(ReliefSongs reliefSongs);


}
