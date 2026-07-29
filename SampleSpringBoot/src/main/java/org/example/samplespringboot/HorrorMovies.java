package org.example.samplespringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("horror")
public class HorrorMovies implements Filter {
    @Override
    public String[] getMovies() {
        return new String[]{"The Exorcist", "The Shining", "Psycho", "Halloween", "A Nightmare on Elm Street"};
    }
}
