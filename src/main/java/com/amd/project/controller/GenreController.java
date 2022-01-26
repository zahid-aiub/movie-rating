package com.amd.project.controller;

import com.amd.project.model.Genre;
import com.amd.project.service.GenreService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "genres")
public class GenreController {

    private final GenreService genreService;

    @PostMapping()
    public int create(@RequestBody Genre genre) {
        return this.genreService.create(genre);
    }

    @GetMapping()
    public ApiResponse<List<Genre>> getAll() {
        List<Genre> genreList = this.genreService.findAll();
        return new ApiResponse<>(200, SUCCESS, genreList);
    }

    @GetMapping("/by-film/{id}")
    public List<Genre> getAllGenreByFilmId(@PathVariable("id") int id, @RequestParam("isSubFilm") boolean isSubFilm) {
        return this.genreService.getFilmGenresList(id, isSubFilm);
    }

}
