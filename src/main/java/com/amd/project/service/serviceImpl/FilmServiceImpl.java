package com.amd.project.service.serviceImpl;

import com.amd.project.model.Film;
import com.amd.project.repository.CustomerRepository;
import com.amd.project.repository.FilmRepository;
import com.amd.project.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Override
    public int create(Film film) {
        return this.filmRepository.create(film.getTitle(), film.getDescription(), film.getReleaseDate());
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAllFilm();
    }
}
