package com.amd.project.dto;

import lombok.Data;

@Data
public class FilmCreateDto {

    private String title;
    private String description;
    private String releaseDate;
    private int[] personIdList;
    private int parentFilmId;
    private int isSubFilm;
    private int[] genreIdList;
    private int zrating;

}