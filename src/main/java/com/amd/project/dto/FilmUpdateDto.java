package com.amd.project.dto;


import lombok.Data;

@Data
public class FilmUpdateDto {

    private int id;
    private String description;
    private String releaseDate;
    private int[] subFilmIdList;
    private int[] filmGenreIdList;
    private int[] filmPersonIdList;
//    private int subFilmLength;
//    private int filmGenreLength;
//    private int filmPersonLength;
    private int isSubFilm;

}
