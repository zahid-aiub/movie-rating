package com.amd.project.service;

import com.amd.project.model.Genre;
import com.amd.project.model.Person;

import java.util.List;

public interface GenreService {
    int create(Genre genre);

    List<Genre> getFilmGenresList(int id, boolean isSubFilm);

    List<Genre> findAll();
}
