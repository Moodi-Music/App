package com.Music.Moodi.Controller;

import com.Music.Moodi.Entity.ReliefSongs;
import com.Music.Moodi.Service.ReliefSongsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/reliefSongs") //http://localhost:8080/api/reliefSongs
public class ReliefSongsController {

    //Injections of our ReliefSongsService
     ReliefSongsService reliefSongsService;


    @PostMapping("/createReliefSongs") //http://localhost:8080/api/relefSongs/createReliefSongs
    //Create ReliefSongs in the database

    public ResponseEntity<ReliefSongs> createReliefSongs(@RequestBody ReliefSongs reliefSongs) {
        ReliefSongs savedReliefSongs = reliefSongsService.createReliefSongs(reliefSongs);
        return new ResponseEntity<>(savedReliefSongs, HttpStatus.CREATED);
    }


    //Now we will create Get All ReliefSongs.

    @GetMapping("/getAllReliefSongs") //http://localhost:8080/api/reliefSongs/getAllReliefSongs

    public ResponseEntity<List<ReliefSongs>> getAllReliefSongs() {
        List<ReliefSongs> reliefSongs = reliefSongsService.getAllReliefSongs();
        return new ResponseEntity<>(reliefSongs, HttpStatus.CREATED);
    }


    //Now we create an update method for ReliefSongs
    //http://localhost:8080/api/reliefSongs/updateReliefSongs
    @PutMapping("/updateReliefSongs/{id}")
    public ResponseEntity<ReliefSongs> updateReliefSongs(@PathVariable ("id") Integer id, @RequestBody ReliefSongs reliefSongs) {

        reliefSongs.setId(id);
        ReliefSongs savedReliefSongs = reliefSongsService.updateReliefSongs(reliefSongs);
        return new ResponseEntity<>(savedReliefSongs, HttpStatus.CREATED);
    }


}
