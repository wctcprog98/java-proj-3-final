package com.javaunit3.springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class BestMovieService {
    private Movie movie;

    @Autowired
    public BestMovieService (@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
}
