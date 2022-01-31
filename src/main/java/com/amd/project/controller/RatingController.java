package com.amd.project.controller;

import com.amd.project.dto.CreateRatingDto;
import com.amd.project.model.Rating;
import com.amd.project.service.RatingService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "ratings")
public class RatingController {

    private final RatingService ratingService;

    @PostMapping()
    public int create(@RequestBody CreateRatingDto createRatingDto) {
        return this.ratingService.create(createRatingDto);
    }

    @GetMapping()
    public ApiResponse<List<Rating>> getAll() {
        List<Rating> ratings = this.ratingService.findAll();
        return new ApiResponse<>(200, SUCCESS, ratings);
    }


}
