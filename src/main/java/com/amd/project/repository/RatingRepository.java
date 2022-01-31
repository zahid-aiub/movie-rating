package com.amd.project.repository;

import com.amd.project.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    @Query(value = "select * from insert_rating(:_customerId, :_filmId, :_is_sub_film, :_value)", nativeQuery = true)
    int create(@Param("_customerId") int _customerId, @Param("_filmId") int _filmId,
               @Param("_is_sub_film") boolean _is_sub_film, @Param("_value") int _value

               );

    @Query(value = "select * from find_all_rating()", nativeQuery = true)
    List<Rating> findAllRating();

}
