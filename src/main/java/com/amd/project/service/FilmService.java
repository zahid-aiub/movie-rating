package com.amd.project.service;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.dto.FilmUpdateDto;
import com.amd.project.model.Film;

import java.util.List;

public interface FilmService {

    int create(FilmCreateDto filmCreateDto);

    int update(FilmUpdateDto filmUpdateDto);

    List<Film> findAll();

    List<Film> searchFilms(String title);

    List<Object> findAllByPersonId(int id);

    Film findById(int id);

    boolean delete(int id);

    List<Film> getAllSuggestedFilm(int userId);
}
