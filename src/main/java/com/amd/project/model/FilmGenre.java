package com.amd.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class FilmGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int filmId;

    private int genreId;

    private boolean isSubFilm;
}
