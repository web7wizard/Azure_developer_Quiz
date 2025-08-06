package com.example.demo;
 // Replace with your actual package name

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webconfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Apply to all endpoints under /api
            .allowedOrigins(
                "http://localhost:63342", // For JetBrains IDEs Live Edit
                "http://localhost:5500",   // For VS Code Live Server
                "http://127.0.0.1:5500",   // For VS Code Live Server
                "null"                     // For opening the HTML file directly (origin: "null")
            )
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("*")
            .allowCredentials(false);
    }
}
