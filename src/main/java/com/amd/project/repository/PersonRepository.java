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

    @Query(value = "select * from get_film_person_list(:_searchId, :_is_sub_film)", nativeQuery = true)
    List<Person> getFilmPersonList(@Param("_searchId") int _searchId, @Param("_is_sub_film") boolean _is_sub_film);

    @Query(value = "select delete_person(:_searchId)", nativeQuery = true)
    boolean delete(@Param("_searchId") int _searchId);

}
