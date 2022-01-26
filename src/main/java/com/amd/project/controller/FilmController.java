package com.amd.project.controller;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.model.Film;
import com.amd.project.service.FilmService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "films")
public class FilmController {

    private final FilmService filmService;

    @PostMapping()
    public int create(@RequestBody FilmCreateDto filmCreateDto) {
        return this.filmService.create(filmCreateDto);
    }

    @GetMapping()
    public ApiResponse<List<Film>> getAll() {
        List<Film> films = this.filmService.findAll();
        return new ApiResponse<>(200, SUCCESS, films);
    }

}
