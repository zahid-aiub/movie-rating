package com.amd.project.repository;

import com.amd.project.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query(value = "select * from insert_film(:name, :age)", nativeQuery = true)
    int create(@Param("customerId") String title, @Param("description") String description, @Param("releaseDate") String releaseDate);

    @Query(value = "select * from find_all_film()", nativeQuery = true)
    List<Film> findAllFilm();

}
