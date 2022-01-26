package com.amd.project.repository;

import com.amd.project.model.Film;
import com.amd.project.model.SubFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubFilmRepository extends JpaRepository<SubFilm, Integer> {

    @Query(value = "select * from get_sub_film_by_parent_id(:_searchId)", nativeQuery = true)
    List<SubFilm> findAllSubFilm(@Param("_searchId") int _searchId);

}
