package com.addyCodes.learnspringframework.runner;

import com.addyCodes.learnspringframework.service.AnimeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    AnimeApiService animeApiService;

    @Override
    public void run(String... args) {

        System.out.println("Are we in the command line neeeooww??");
        animeApiService.fetchAnimeData();
    }
}
