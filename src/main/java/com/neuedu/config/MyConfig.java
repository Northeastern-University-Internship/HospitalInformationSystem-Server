package com.neuedu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                //.allowedOrigins("*")
        		.allowedOriginPatterns("*")
        		.allowCredentials(true)
                .allowedMethods("*")
                .allowedHeaders("*")
                .maxAge(36000);
    }
}
