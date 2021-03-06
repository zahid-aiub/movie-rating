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

    @GetMapping()
    public ApiResponse<List<Person>> getAll() {
        List<Person> personList = this.personService.findAll();
        return new ApiResponse<>(200, SUCCESS, personList);
    }

}
