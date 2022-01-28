package com.amd.project.service.serviceImpl;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.dto.FilmUpdateDto;
import com.amd.project.model.Film;
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

        return this.filmRepository.create(
                filmCreateDto.getTitle(), filmCreateDto.getDescription(), filmCreateDto.getReleaseDate(),
                filmCreateDto.getParentFilmId(), filmCreateDto.getIsSubFilm() == 1, personIdList.toString(),
                genreIdList.toString(), filmCreateDto.getPersonIdList().length, filmCreateDto.getGenreIdList().length
        );
    }

    @Override
    public int update(FilmUpdateDto filmUpdateDto) {
        StringBuilder personIdList = new StringBuilder();
        StringBuilder genreIdList = new StringBuilder();
        StringBuilder subFilmList = new StringBuilder();

        for (int i = 0; i < filmUpdateDto.getFilmPersonIdList().length; i++) {
            personIdList.append(filmUpdateDto.getFilmPersonIdList()[i]).append(",");
        }
        for (int i = 0; i < filmUpdateDto.getFilmGenreIdList().length; i++) {
            genreIdList.append(filmUpdateDto.getFilmGenreIdList()[i]).append(",");
        }
        for (int i = 0; i < filmUpdateDto.getSubFilmIdList().length; i++) {
            subFilmList.append(filmUpdateDto.getSubFilmIdList()[i]).append(",");
        }
        if (personIdList.length() > 0) {
            personIdList.setLength(personIdList.length() - 1);
        }
        if (genreIdList.length() > 0) {
            genreIdList.setLength(genreIdList.length() - 1);
        }
        if (subFilmList.length() > 0) {
            subFilmList.setLength(subFilmList.length() - 1);
        }

        return this.filmRepository.update(
                filmUpdateDto.getId(), filmUpdateDto.getDescription(), filmUpdateDto.getReleaseDate(),
                filmUpdateDto.getIsSubFilm() == 1 ? "" : subFilmList.toString(), genreIdList.toString(), personIdList.toString(),
                filmUpdateDto.getSubFilmIdList().length, filmUpdateDto.getFilmGenreIdList().length,
                filmUpdateDto.getFilmPersonIdList().length, filmUpdateDto.getIsSubFilm() == 1
        );
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAllFilm();
    }

    @Override
    public List<Film> findAllByPersonId(int id) {
        return filmRepository.findAllByPersonId(id);
    }

    @Override
    public Film findById(int id) {
        return this.filmRepository.findById(id);
    }

    @Override
    public double getFilmRating(int id, boolean isSubFilm) {
        return this.filmRepository.getFilmRating(id, isSubFilm);
    }

    @Override
    public boolean delete(int id) {
        return this.filmRepository.delete(id);
    }
}
