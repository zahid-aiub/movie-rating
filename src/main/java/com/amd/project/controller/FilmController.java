package com.amd.project.controller;

import com.amd.project.model.Customer;
import com.amd.project.model.Film;
import com.amd.project.service.FilmService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "films")
public class FilmController {

    private final FilmService filmService;

    @PostMapping()
    public int create(@RequestBody Film film) {
        return this.filmService.create(film);
    }

    @GetMapping()
    public ApiResponse<List<Film>> getAll() {
        List<Film> films = this.filmService.findAll();
        return new ApiResponse<>(200, SUCCESS, films);
    }

}
