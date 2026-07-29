package org.example.samplespringboot;

import org.springframework.stereotype.Component;

@Component
public class HorrorMovies implements Filter {
    @Override
    public String[] getMovies() {
        return new String[]{"The Exorcist", "The Shining", "Psycho", "Halloween", "A Nightmare on Elm Street"};
    }
}
