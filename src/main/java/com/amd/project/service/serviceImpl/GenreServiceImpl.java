package com.amd.project.service.serviceImpl;

import com.amd.project.model.Genre;
import com.amd.project.repository.GenreRepository;
import com.amd.project.repository.PersonRepository;
import com.amd.project.service.GenreService;
import com.amd.project.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    @Override
    public int create(Genre genre) {
        return this.genreRepository.createGenre(genre.getName(), genre.getCreatedAt());
    }

    @Override
    public List<Genre> findAll() {
        return this.genreRepository.findAllGenre();
    }
}
