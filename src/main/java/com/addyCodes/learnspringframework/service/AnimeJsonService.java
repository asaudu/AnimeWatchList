package com.addyCodes.learnspringframework.service;

import com.addyCodes.learnspringframework.model.Anime;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface AnimeJsonService {
    @PostExchange("/animes")
    List<Anime> findAll();
}
