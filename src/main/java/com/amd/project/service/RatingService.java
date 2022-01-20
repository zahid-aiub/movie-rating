package com.amd.project.service;

import com.amd.project.model.Rating;

import java.util.List;

public interface RatingService {

    int create(Rating rating);

    List<Rating> findAll();
}
