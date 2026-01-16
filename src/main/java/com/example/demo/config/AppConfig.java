package com.example.demo.config;

import com.example.demo.Computer;
import com.example.demo.Desktop;
import com.example.demo.Human;
import com.example.demo.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

//    @Bean
//    public Human human(@Qualifier("laptop") Computer com){
//        Human h1 = new Human();
//        h1.setAge(23);
//        h1.setCom(com);
//        return h1;
//    }
//
//
////    @Bean({"com1", "desktop", "Beast"})
//    @Bean
////    @Scope("prototype")
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }


}


// Stereotype annotation, primarily in the Spring Framework, marks a class with a specific role (like @Service, @Repository) for automatic component detection and management by the Spring container, simplifying configuration and improving code readability by defining a component's purpose (e.g., business logic, data access). These annotations are specialized versions of the base @Component, automatically registering beans without manual XML or Java configuration
