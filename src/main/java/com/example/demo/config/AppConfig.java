package com.example.demo.config;

import com.example.demo.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean({"com1", "desktop", "Beast"})
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
