package com.amd.project.repository;

import com.amd.project.model.Genre;
import com.amd.project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    @Query(value = "select * from insert_person(:name)", nativeQuery = true)
    int createGenre(@Param("name") String name);

    @Query(value = "select * from find_all_person()", nativeQuery = true)
    List<Genre> findAllGenre();
}
