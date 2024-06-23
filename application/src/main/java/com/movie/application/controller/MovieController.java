package com.movie.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.application.service.MovieService;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/getByTitle")
    public ResponseEntity<?> getMovieByTitle(@RequestParam String title) {
        return new ResponseEntity<>(movieService.searchMoviesByTitle(title), HttpStatus.OK);
    }

}
