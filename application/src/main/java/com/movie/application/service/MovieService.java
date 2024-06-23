package com.movie.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.application.model.Movie;
import com.movie.application.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> searchMoviesByTitle(String title) {
        return this.movieRepository.findSearchResults(title).stream().toList();
    }
}
