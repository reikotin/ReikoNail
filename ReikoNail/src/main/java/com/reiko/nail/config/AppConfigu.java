package com.reiko.nail.config;

import java.net.http.HttpClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigu {

    @Bean
    public HttpClient httpClient() {
        return HttpClient.newHttpClient();
    }
}
