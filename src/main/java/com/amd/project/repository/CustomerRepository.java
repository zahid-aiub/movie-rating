package com.amd.project.repository;

import com.amd.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import java.sql.Date;
import java.util.List;
//import java.util.Date;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select * from insert_person(:name, :age)", nativeQuery = true)
    int createUser(@Param("name") String name, @Param("age") int age);

    @Query(value = "select * from find_all_person()", nativeQuery = true)
    List<Customer> findAllUser();
}
