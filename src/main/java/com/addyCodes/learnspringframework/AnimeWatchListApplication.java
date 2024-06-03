package com.addyCodes.learnspringframework;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringbootstarter.JasyptSpringBootAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ImportAutoConfiguration(classes = JasyptSpringBootAutoConfiguration.class) // Remove when Jasypt is released for spring boot 3 (or at least 2.7)
@EnableEncryptableProperties
@EnableScheduling
public class AnimeWatchListApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnimeWatchListApplication.class, args);
    }
}
