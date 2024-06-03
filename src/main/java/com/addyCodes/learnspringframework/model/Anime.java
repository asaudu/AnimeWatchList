package com.addyCodes.learnspringframework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//Plain oh java object aka POJO
public class Anime {

    @JsonProperty("en")
    private String animeTitle;

    @JsonProperty("id")
    private int id;

    @JsonProperty("episodeCount")
    private int episodeCount;

    @JsonProperty("synopsis")
    private String synopsis;

    private String animeId;

    public String getAnimeId() {
        return animeId;
    }

    public void setAnimeId(String animeId) {
        this.animeId = animeId;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
