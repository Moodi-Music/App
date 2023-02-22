package com.Music.Moodi.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


@Table(name = "happy")
public class HappySongs {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "songName" , nullable = false)
    private String songName;
    @Column(name = "artistName" , nullable = false)
    private String artistName;
    @Column(name = "songUrl" , nullable = false, unique = true)
    private String songUrl;


}
