package com.amd.project.service;

import com.amd.project.model.Person;
import java.util.List;

public interface PersonService {

    int create(Person person);

    List<Person> findAll();
}
