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
        return this.personRepository.createPerson(person.getName(), person.getDob(), person.getSex(), person.getType());
    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAllPerson();
    }

}
