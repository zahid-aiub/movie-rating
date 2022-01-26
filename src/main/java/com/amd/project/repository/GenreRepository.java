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

    @Query(value = "select * from get_genre_list()", nativeQuery = true)
    List<Genre> findAllGenre();
}
