package com.Music.Moodi.Service;


import com.Music.Moodi.Entity.HappySongs;

import java.util.List;

public interface HappySongsService {


    //We create createHappySongs method.
    HappySongs createHappySongs(HappySongs happySongs);


    //We create getAllHappySongs list.

    List<HappySongs> getAllHappySongs();


    HappySongs updateHappySongs(HappySongs happySongs);
}
