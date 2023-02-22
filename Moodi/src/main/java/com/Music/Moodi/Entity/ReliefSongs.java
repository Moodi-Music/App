package com.Music.Moodi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ComponentScan

@Table(name = "stress_songs")
@Entity
public class ReliefSongs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "songName", nullable = false)
    private String songName;
    @Column(name = "artistName", nullable = false)
    private String artistName;

    @Column(name = "songUrl", nullable = false, unique = true)
    private String songUrl;


}
