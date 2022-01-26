package com.amd.project.service.serviceImpl;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.model.SubFilm;
import com.amd.project.repository.SubFilmRepository;
import com.amd.project.service.SubFilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class SubFilmServiceImpl implements SubFilmService {

    private final SubFilmRepository subFilmRepository;

    @Override
    public List<SubFilm> findAll(int filmId) {
        return this.subFilmRepository.findAllSubFilm(filmId);
    }
}
