package com.amd.project.repository;

import com.amd.project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query(value = "select insert_person( :_dob, :_name, :_sex, :_type)", nativeQuery = true)
    int createPerson( @Param("_dob") String _dob, @Param("_name") String _name,
                @Param("_sex") String _sex, @Param("_type") String _type);

    @Query(value = "select * from get_person_list()", nativeQuery = true)
    List<Person> findAllPerson();

}
