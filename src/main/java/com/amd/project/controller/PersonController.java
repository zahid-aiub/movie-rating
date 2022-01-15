package com.amd.project.controller;

import com.amd.project.model.Person;
import com.amd.project.service.PersonService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/add")
    public int create(@RequestBody Person person) {
        return this.personService.create(person);
    }

    @GetMapping("/all")
    public ApiResponse<List<Person>> getAll() {
        List<Person> personList = this.personService.findAll();
        return new ApiResponse<>(200, SUCCESS, personList);
    }

}
