package com.example.demo.config;

import com.example.demo.Computer;
import com.example.demo.Desktop;
import com.example.demo.Human;
import com.example.demo.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Human human(@Qualifier("laptop") Computer com){
        Human h1 = new Human();
        h1.setAge(23);
        h1.setCom(com);
        return h1;
    }


//    @Bean({"com1", "desktop", "Beast"})
    @Bean
//    @Scope("prototype")
    @Primary
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}
