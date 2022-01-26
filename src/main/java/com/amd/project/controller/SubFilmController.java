package com.amd.project.controller;


import com.amd.project.service.SubFilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "sub-films")
public class SubFilmController {

    private final SubFilmService subFilmService;

}
