package org.example.samplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommendedMovies {

    Filter fantasyMovies;


    public RecommendedMovies(@Qualifier("horror") Filter fantasyMovies) {
        this.fantasyMovies = fantasyMovies;
    }

    public String[] getMovies() {
        return fantasyMovies.getMovies();
    }
}
