package com.MyMusic.API.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "happy_songs")
public class HappySongs {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // This will auto generate the id for us.
    private int Id;

    @Column(nullable = false)
    private String songName;
    @Column(nullable = false)
    private String artistName;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false, unique = true)
    private String url;
}
