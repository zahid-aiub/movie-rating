package com.amd.project.controller;

import com.amd.project.model.Genre;
import com.amd.project.model.Person;
import com.amd.project.service.GenreService;
import com.amd.project.service.PersonService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "genre")
public class GenreController {

    private final GenreService genreService;

    @PostMapping("/add")
    public int create(@RequestBody Genre genre) {
        return this.genreService.create(genre);
    }

    @GetMapping("/all")
    public ApiResponse<List<Genre>> getAll() {
        List<Genre> genreList = this.genreService.findAll();
        return new ApiResponse<>(200, SUCCESS, genreList);
    }
}
