package com.addyCodes.learnspringframework.scheduler;

import com.addyCodes.learnspringframework.service.AnimeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Scheduler {

    @Autowired
    AnimeApiService animeApiService;

    @Scheduled(fixedDelay = 180000, initialDelay = 60000)//cron = "0n*/2 * * * *"
    public void scheduler(){
        System.out.println("Let's add another anime to the watchlist!");
        animeApiService.fetchAnimeData();
    }
}
