package org.example.samplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommendedMovies {

    Filter fantasyMovies;


    public RecommendedMovies(Filter filter) {
        this.fantasyMovies = filter;
    }

    public String[] getMovies() {
        return fantasyMovies.getMovies();
    }
}
