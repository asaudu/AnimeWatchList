package com.addyCodes.learnspringframework.service;

import com.addyCodes.learnspringframework.model.AnimeEntry;
import com.addyCodes.learnspringframework.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
@Service
public class CsvService {
    @Autowired
    AnimeRepository animeRepo;
    public void CreateCsv() {
        List<AnimeEntry> result = animeRepo.findAll();
        try {
            PrintWriter printWriter = new PrintWriter("/Users/adaoraaudu/Desktop/CSV/animeList.csv");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id");
            stringBuilder.append(",");
            stringBuilder.append("animeTitle");
            stringBuilder.append(",");
            stringBuilder.append("episodeCount");
            stringBuilder.append(",");
            stringBuilder.append("synopsis");
            stringBuilder.append("\r\n");
            Iterator iterator = result.iterator();
            while(iterator.hasNext()) {
                AnimeEntry animeEntry = (AnimeEntry) iterator.next();
                stringBuilder.append(animeEntry.getId());
                stringBuilder.append(" , ");
                stringBuilder.append(animeEntry.getAnimeTitle());
                stringBuilder.append(" , ");
                stringBuilder.append(animeEntry.getEpisodeCount());
                stringBuilder.append(" , ");
                stringBuilder.append(animeEntry.getSynopsis());
                stringBuilder.append("\r\n");
            }
            printWriter.write(stringBuilder.toString());
            printWriter.close();
            System.out.println("CSV Completed. Check out your Anime Watch List!");
        } catch (Exception e) {
            System.out.println("Mmmm..something went wrong here: " + e);
            e.printStackTrace();
        }
    }
}
