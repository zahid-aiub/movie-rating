package com.amd.project.service;

import com.amd.project.model.Person;
import java.util.List;

public interface PersonService {

    int create(Person person);

    int update(Person person);

    List<Person> findAll();

    Person getById(int id);

    List<Person> getFilmPersonList(int id, boolean isSubFilm);

    boolean delete(int id);
}
