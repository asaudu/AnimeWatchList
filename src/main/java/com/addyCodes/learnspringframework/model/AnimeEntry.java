package com.addyCodes.learnspringframework.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.util.UUID;

//This is actually used to write to the database
@Document
public class AnimeEntry {
    @Id
    private String animeID = UUID.randomUUID().toString();
    @Field
    private int id;
    @Field
    private String animeTitle;
    @Field
    private int episodeCount;
    @Field
    private String synopsis;

    //compacted setter syntax
    public AnimeEntry(int id, String animeTitle, int episodeCount, String synopsis) {
        //this.animeID = animeId;
        this.id = this.id;
        this.animeTitle = animeTitle;
        this.episodeCount = episodeCount;
        this.synopsis = synopsis;
    }

    public String getAnimeID() {
        return animeID;
    }

    public int getId() {
        return id;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public String getSynopsis() {
        return synopsis;
    }
}
