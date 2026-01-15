package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Human obj = (Human) context.getBean("human");
//        obj.code();

    }
}
