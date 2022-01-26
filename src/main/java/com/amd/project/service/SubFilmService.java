package com.amd.project.service;

import com.amd.project.model.SubFilm;

import java.util.List;

public interface SubFilmService {

    List<SubFilm> findAll(int filmId);
}
