package com.amd.project.repository;

import com.amd.project.model.Genre;
import com.amd.project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

    @Query(value = "select insert_genre(:_name, :_createdAt)", nativeQuery = true)
    int createGenre(@Param("_name") String _name, @Param("_createdAt") String _createdAt);

    @Query(value = "select * from get_film_genre_list(:_searchId, :_is_sub_film)", nativeQuery = true)
    List<Genre> getFilmGenresList(@Param("_searchId") int _searchId, @Param("_is_sub_film") boolean _is_sub_film);

    @Query(value = "select * from get_genre_list()", nativeQuery = true)
    List<Genre> findAllGenre();

    @Query(value = "select * from get_genre_info(:_searchId)", nativeQuery = true)
    Genre getGenreById(@Param("_searchId") int _searchId);
}
