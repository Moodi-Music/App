package com.MyMusic.API.Controller;

import com.MyMusic.API.Bean.HappySongs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HappySongsController {

    //Creating post mapping that post the happy songs details in the database
    @PostMapping("/postHappySongs")
    public HappySongs postHappySongs(HappySongs happySongs) {
        //adding songs to the database

        postHappySongs(
                new HappySongs(1, "", "", "", "")
        );
        return happySongs;
    }




    //http://localhost:8080/getAllHappySongs
    @GetMapping("/getAllHappySongs") // This is the URL that the user will type in to get the happy songs

    public List<HappySongs> getAllHappySongs() {
       List <HappySongs> happySongs = new ArrayList<>();
       happySongs.add(new HappySongs(1, "Levitating", "Dua Lipa", "POP", "https://youtu.be/TUVcZfQe-Kw"));
        return happySongs;
    }


}
