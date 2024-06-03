package com.addyCodes.learnspringframework.controller;

import com.addyCodes.learnspringframework.model.Anime;
import com.addyCodes.learnspringframework.model.AnimeRequest;
import com.addyCodes.learnspringframework.repository.AnimeRepository;
import com.addyCodes.learnspringframework.runner.Runner;
import com.addyCodes.learnspringframework.service.AnimeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
// I believe I will implement the metric writes here and tie them to endpoints
    @Autowired
    private Runner runner;

    @GetMapping("/")
    public String index() {
        return runner.toString();
    }

    @RequestMapping("/animes")
    List<Anime> findAll() {
        return null;
    }
}
