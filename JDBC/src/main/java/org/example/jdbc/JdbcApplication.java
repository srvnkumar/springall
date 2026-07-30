package org.example.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PlayerDao playerDao;

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("French Players: {}", playerDao.getPlayerByNationality("France"));
    }
}
