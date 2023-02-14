package com.Music.Moodi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/api/relefSongs")
public class RelefSongs {



    @PostMapping("/createRelefSongs") //http://localhost:8080/api/relefSongs/createRelefSongs
    public ResponseEntity<RelefSongs> createRelefSongs(@RequestBody RelefSongs relefSongs){
    //    RelefSongs savedRelefSongs = relefSongsService.createRelefSongs(relefSongs);
        return null;
    }


}
