package com.addyCodes.learnspringframework.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class GetAnimeUrl {
    @Value("${spring.apiUrl}")
    private String apiUrl;

    public String getAnimeUrl() {
        Scanner scanner = new Scanner(System.in);
        String requestedAnime;

        System.out.println("What anime are you looking for");
        requestedAnime = scanner.nextLine();
        requestedAnime.replaceAll("\s", "%20");
        String url = apiUrl + requestedAnime;

        return url;
    }
}
