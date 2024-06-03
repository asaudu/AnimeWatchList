package com.addyCodes.learnspringframework.service;

import com.addyCodes.learnspringframework.config.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetResponseBody {
    @Autowired
    private RestTemplate restTemplate = RestTemplateConfig.restTemplate();

    public String getResponseBody(String url) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        String responseJson = responseEntity.getBody();

        return responseJson;
    }
}
