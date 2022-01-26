package com.amd.project.controller;

import com.amd.project.dto.FilmCreateDto;
import com.amd.project.model.Film;
import com.amd.project.model.SubFilm;
import com.amd.project.service.FilmService;
import com.amd.project.service.SubFilmService;
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
    private final SubFilmService subFilmService;

    @PostMapping()
    public int create(@RequestBody FilmCreateDto filmCreateDto) {
        return this.filmService.create(filmCreateDto);
    }

    @GetMapping()
    public ApiResponse<List<Film>> getAll() {
        List<Film> films = this.filmService.findAll();
        return new ApiResponse<>(200, SUCCESS, films);
    }

    @GetMapping("/:id/sub-films")
    public ApiResponse<List<SubFilm>> getAll(@PathVariable("id") int id) {
        List<SubFilm> films = this.subFilmService.findAll(id);
        return new ApiResponse<>(200, SUCCESS, films);
    }

}
