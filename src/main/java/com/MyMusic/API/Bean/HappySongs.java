package com.MyMusic.API.Bean;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HappySongs {
    private int Id;
    private String songName;
    private String artistName;
    private String genre;

    private String url;


    public HappySongs(int id, String songName, String artistName, String genre, String url) {
        Id = id;
        this.songName = songName;
        this.artistName = artistName;
        this.genre = genre;
        this.url = url;
    }


}
