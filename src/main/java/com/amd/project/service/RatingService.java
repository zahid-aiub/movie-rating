package com.amd.project.service;

import com.amd.project.dto.CreateRatingDto;
import com.amd.project.model.Rating;

import java.util.List;

public interface RatingService {

    int create(CreateRatingDto createRatingDto);

    List<Rating> findAll();
}
