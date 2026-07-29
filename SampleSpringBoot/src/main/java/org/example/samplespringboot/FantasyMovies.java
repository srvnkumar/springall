package org.example.samplespringboot;

import org.springframework.stereotype.Component;

@Component
public class FantasyMovies implements Filter {
    @Override
    public String[] getMovies() {
        return new String[]{"The Lord of the Rings", "Harry Potter", "The Chronicles of Narnia", "Pan's Labyrinth", "Stardust"};
    }
}
