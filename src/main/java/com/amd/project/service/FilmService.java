package com.amd.project.service;

import com.amd.project.model.Film;

import java.util.List;

public interface FilmService {

    int create(Film film);

    List<Film> findAll();
}
