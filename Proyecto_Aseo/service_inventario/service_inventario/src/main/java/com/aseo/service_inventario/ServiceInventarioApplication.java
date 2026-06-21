package com.aseo.service_inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ServiceInventarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceInventarioApplication.class, args);
    }

   
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}