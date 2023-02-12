package com.Music.Moodi.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // This annotation is used to scan JPA entities.
@Table(name = "HappySongs")

public class HappySongs {
    @Id // This annotation is used to specify the primary key of an entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String songName;
    @Column(nullable = false)
    private String artistName;
    @Column(nullable = false, unique = true)
    private String songUrl;
}
