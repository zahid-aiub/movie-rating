package com.amd.project.repository;

import com.amd.project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "select * from insert_person(:name, :dob, :sex, :type)", nativeQuery = true)
    int createPerson(@Param("name") String name, @Param("dob") String dob,
                @Param("sex") String sex, @Param("type") String type);

    @Query(value = "select * from find_all_person()", nativeQuery = true)
    List<Person> findAllPerson();

}
