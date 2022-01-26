package com.amd.project.service;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.model.Film;

import java.util.List;

public interface FilmService {

    int create(FilmCreateDto filmCreateDto);

    List<Film> findAll();
}
