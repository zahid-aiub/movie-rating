package com.amd.project.controller;

import com.amd.project.model.Person;
import com.amd.project.service.PersonService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "persons")
public class PersonController {

    private final PersonService personService;

    @PostMapping()
    public int create(@RequestBody Person person) {
        return this.personService.create(person);
    }

    @PutMapping()
    public int update(@RequestBody Person person) {
        return this.personService.update(person);
    }

    @GetMapping()
    public ApiResponse<List<Person>> getAll() {
        List<Person> personList = this.personService.findAll();
        return new ApiResponse<>(200, SUCCESS, personList);
    }

    @GetMapping("/{id}")
    public Person getFilmPersonList(@PathVariable("id") int id) {
        return this.personService.getById(id);
    }

    @GetMapping("/by-film/{id}")
    public List<Person> getFilmPersonList(@PathVariable("id") int id, @RequestParam("isSubFilm") boolean isSubFilm) {
        return this.personService.getFilmPersonList(id, isSubFilm);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.personService.delete(id);
    }

}
