package com.addyCodes.learnspringframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeApiService implements AnimeApiInterfaceService{
    @Autowired
    GetAnimeUrl getAnimeUrl;
    @Autowired
    GetResponseBody getResponseBody;
    @Autowired
    ParseResponseBody parseResponseBody;

    public String fetchAnimeData() {
        String url = getAnimeUrl.getAnimeUrl();
        String responseJson = getResponseBody.getResponseBody(url);
        parseResponseBody.parseResponseBody(responseJson);

        return null;
    }
}
