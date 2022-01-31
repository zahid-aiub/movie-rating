package com.amd.project.service.serviceImpl;

import com.amd.project.dto.CreateRatingDto;
import com.amd.project.model.Rating;
import com.amd.project.repository.CustomerRepository;
import com.amd.project.repository.RatingRepository;
import com.amd.project.service.RatingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;

    @Override
    public int create(CreateRatingDto rating) {
        return this.ratingRepository.create(rating.getCustomerId(), rating.getFilmId(),
                rating.getIsSubFilm() == 1, rating.getValue());
    }

    @Override
    public List<Rating> findAll() {
        return this.ratingRepository.findAllRating();
    }
}


