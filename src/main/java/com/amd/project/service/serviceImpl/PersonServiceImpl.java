package com.amd.project.service.serviceImpl;

import com.amd.project.model.Person;
import com.amd.project.repository.PersonRepository;
import com.amd.project.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public int create(Person person) {
        return this.personRepository.createPerson(person.getDob(), person.getName(), person.getSex(), person.getType());
    }

    public int update(Person person) {
        return this.personRepository.updatePerson(person.getId(), person.getDob(), person.getName(), person.getSex(), person.getType());
    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAllPerson();
    }

    @Override
    public Person getById(int id) {
        return personRepository.getById(id);
    }

    @Override
    public List<Person> getFilmPersonList(int id, boolean isSubFilm) {
        return this.personRepository.getFilmPersonList(id, isSubFilm);
    }

    @Override
    public boolean delete(int id) {
        return this.personRepository.delete(id);
    }

}
