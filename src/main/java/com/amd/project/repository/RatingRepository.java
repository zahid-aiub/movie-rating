package com.amd.project.repository;

import com.amd.project.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {

   /* @Query(value = "select * from insert_rating(:name, :age)", nativeQuery = true)
    int create(@Param("customerId") int customerId, @Param("filmId") int filmId, @Param("value") int value);

    @Query(value = "select * from find_all_rating()", nativeQuery = true)
    List<Rating> findAllRating();*/

}
