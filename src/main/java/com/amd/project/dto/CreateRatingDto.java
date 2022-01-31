package com.amd.project.dto;

import lombok.Data;

@Data
public class CreateRatingDto {

    private int customerId;

    private int filmId;

    private int value;

    private int isSubFilm;
}
