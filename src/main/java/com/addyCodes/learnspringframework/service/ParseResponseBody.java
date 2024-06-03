package com.addyCodes.learnspringframework.service;

import com.addyCodes.learnspringframework.model.AnimeEntry;
import com.addyCodes.learnspringframework.repository.AnimeRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParseResponseBody {
    @Autowired
    private AnimeRepository animeRepo;
    @Autowired
    CsvService csvService;
    public String parseResponseBody(String responseJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(responseJson);
            JsonNode dataArray = rootNode.get("data");
            System.out.println("dataArray check here \n" + dataArray.toString());
            if(dataArray != null && dataArray.size() > 0) {
                JsonNode firstDataItem = dataArray.get(0);
                int id = firstDataItem.get("id").asInt();
                String title = firstDataItem.get("attributes").get("titles").get("en").asText();
                int episodeCount = firstDataItem.get("attributes").get("episodeCount").asInt();
                String synopsis = firstDataItem.get("attributes").get("synopsis").asText();
                if(title.length() < 1) {
                    title = firstDataItem.get("attributes").get("titles").get("en_jp").asText();
                }
                JSONObject animeObject = new JSONObject(id, title, String.valueOf(episodeCount), synopsis);
                animeObject.put("id", id);
                animeObject.put("animeTitle", title);
                animeObject.put("episodeCount", episodeCount);
                animeObject.put("synopsis", synopsis);
                AnimeEntry newEntry = new AnimeEntry(animeObject.getInt("id"), animeObject.getString("animeTitle"), animeObject.getInt("episodeCount"), animeObject.getString("synopsis"));
                animeRepo.save(newEntry);
                csvService.CreateCsv();
                return animeObject.toString();
            }
        } catch (Exception e) {
            System.out.println("Oops, ran into an error here " + e);
        }
        return null;
    }
}
