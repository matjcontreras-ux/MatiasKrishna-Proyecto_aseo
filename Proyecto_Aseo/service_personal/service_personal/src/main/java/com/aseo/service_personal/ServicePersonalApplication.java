package com.aseo.service_personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean; // <- Importante
import org.springframework.web.reactive.function.client.WebClient; // <- Importante

@SpringBootApplication
public class ServicePersonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePersonalApplication.class, args);
    }

    
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}