package com.amd.project.repository;

import com.amd.project.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {

    @Query(value = "select find_all()", nativeQuery = true)
    public List<Test> findAllData();

    @Query(value = "select sp_findBetween(:min, :max)", nativeQuery = true)
    int findCount(@Param("min") int min, @Param("max") int max);

//    @Procedure("sp_findBetween(:min, :max)")
//    int findCount(@Param("min") int min, @Param("max") int max);

/*
    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);

*/
}
