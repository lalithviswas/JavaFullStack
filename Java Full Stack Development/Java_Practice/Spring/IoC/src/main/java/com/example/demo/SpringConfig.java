package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class SpringConfig {
    @Bean
    Fresher fresh(){
        return new Fresher();
    }
}
