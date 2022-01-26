package com.amd.project.service.serviceImpl;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.model.Film;
import com.amd.project.repository.FilmRepository;
import com.amd.project.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
@Slf4j
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Override
    public int create(FilmCreateDto filmCreateDto) {
        StringBuilder personIdList = new StringBuilder();
        StringBuilder genreIdList = new StringBuilder();

        for (int i = 0; i < filmCreateDto.getPersonIdList().length; i++) {
            personIdList.append(filmCreateDto.getPersonIdList()[i]).append(",");
        }
        for (int i = 0; i < filmCreateDto.getGenreIdList().length; i++) {
            genreIdList.append(filmCreateDto.getGenreIdList()[i]).append(",");
        }
        if (personIdList.length() > 0) {
            personIdList.setLength(personIdList.length() - 1);
        }
        if (genreIdList.length() > 0) {
            genreIdList.setLength(genreIdList.length() - 1);
        }
        ;

        return this.filmRepository.create(
                filmCreateDto.getTitle(), filmCreateDto.getDescription(), filmCreateDto.getReleaseDate(),
                filmCreateDto.getParentFilmId(), filmCreateDto.isSubFilm(), personIdList.toString(),
                genreIdList.toString(), filmCreateDto.getPersonIdList().length, filmCreateDto.getGenreIdList().length
        );
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAllFilm();
    }
}
