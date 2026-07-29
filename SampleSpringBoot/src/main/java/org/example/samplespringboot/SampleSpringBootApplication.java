package org.example.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SampleSpringBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SampleSpringBootApplication.class, args);
        FantasyMovies fantasyMovies = context.getBean(FantasyMovies.class);
        System.out.println(Arrays.toString(fantasyMovies.getMovies()));
    }

}
