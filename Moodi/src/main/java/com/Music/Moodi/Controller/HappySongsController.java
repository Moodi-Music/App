package com.Music.Moodi.Controller;

import com.Music.Moodi.Entity.HappySongs;
import com.Music.Moodi.Service.HappySongsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/happySongs")
public class HappySongsController {

    //Injections of our HappySongsService
    HappySongsService happySongsService;

    //http://localhost:8080/api/happySongs/createHappySongs
    @PostMapping ("/createHappySongs")

    public ResponseEntity<HappySongs> createHappySongs(@RequestBody HappySongs happySongs){
        HappySongs savedHappySongs = happySongsService.createHappySongs(happySongs);
        return new ResponseEntity<>(savedHappySongs, HttpStatus.CREATED);
    }




    //Now we will create Get All HappySongs.
    //http://localhost:8080/api/happySongs/getAllHappySongs

    @GetMapping ("/getAllHappySongs")
    public ResponseEntity<List<HappySongs>> getAllHappySongs(){
        List<HappySongs> savedHappySongs = happySongsService.getAllHappySongs();
        return new ResponseEntity<>(savedHappySongs, HttpStatus.CREATED);
    }


    //Now we create PutMapping for updating HappySongs
    //http://localhost:8080/api/happySongs/updateHappySongs
    @PutMapping ("/updateHappySongs")
    public ResponseEntity<HappySongs> updateHappySongs(@RequestBody HappySongs happySongs){
        HappySongs savedHappySongs = happySongsService.updateHappySongs(happySongs);
        return new ResponseEntity<>(savedHappySongs, HttpStatus.CREATED);
    }

}
