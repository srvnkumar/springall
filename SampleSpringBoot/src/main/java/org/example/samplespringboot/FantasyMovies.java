package org.example.samplespringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FantasyMovies implements Filter {
    @Override
    public String[] getMovies() {
        return new String[]{"The Lord of the Rings", "Harry Potter", "The Chronicles of Narnia", "Pan's Labyrinth", "Stardust"};
    }
}
