package com.addyCodes.learnspringframework.model;

import java.util.UUID;

public class AnimeRequest {
    private String animeId;
    private String animeTitle, synopsis;
    private int id, episodeCount;

    public AnimeRequest(String animeId, int id, String animeTitle, int episodeCount, String synopsis) {
        this.animeId = animeId;
        this.id = id;
        this.animeTitle = animeTitle;
        this.episodeCount = episodeCount;
        this.synopsis = synopsis;
    }

    public Anime getAnime() {
        return new Anime();
    }
//    public Anime getAnime() {
//        return new Anime(UUID.randomUUID().toString(), animeTitle, id, episodeCount, synopsis);
//    }
}
