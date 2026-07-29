package org.example.samplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommendedMovies {

    Filter filter;


    public RecommendedMovies(Filter filter) {
        this.filter = filter;
    }

    public String[] getMovies() {
        return filter.getMovies();
    }
}
