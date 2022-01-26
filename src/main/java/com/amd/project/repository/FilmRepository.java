package com.amd.project.repository;

import com.amd.project.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(value = "select insert_film(:_filmTitle, :_filmDesc, :_filmRelDate, :_parentFilmId, :_isSubFilm,  :_personIdList, :_genreIdList, :_personIdLength, :_genreIdLength)", nativeQuery = true)
    int create(@Param("_filmTitle") String _filmTitle,
               @Param("_filmDesc") String _filmDesc,
               @Param("_filmRelDate") String _filmRelDate,
               @Param("_parentFilmId") int _parentFilmId,
               @Param("_isSubFilm") boolean _isSubFilm,
               @Param("_personIdList") String _personIdList,
               @Param("_genreIdList") String _genreIdList,
               @Param("_personIdLength") int  _personIdLength,
               @Param("_genreIdLength") int _genreIdLength
    );

    @Query(value = "select * from get_film_list()", nativeQuery = true)
    List<Film> findAllFilm();

}
