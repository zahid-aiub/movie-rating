package com.amd.project.controller;

import com.amd.project.model.Rating;
import com.amd.project.service.RatingService;
import com.amd.project.utils.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.amd.project.config.Constrain.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "ratings")
public class RatingController {

    private final RatingService ratingService;

    @PostMapping()
    public int create(@RequestBody Rating rating) {
        return this.ratingService.create(rating);
    }

    @GetMapping()
    public ApiResponse<List<Rating>> getAll() {
        List<Rating> ratings = this.ratingService.findAll();
        return new ApiResponse<>(200, SUCCESS, ratings);
    }


}
