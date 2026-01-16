package com.example.demo;

import com.example.demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop", Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean("desktop", Desktop.class);
        dt.compile();











                                  //XML Based Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Human obj = (Human) context.getBean("human");
//        System.out.println(obj.age);
//        obj.code();


//        obj.setAge(21);
//        System.out.println(obj.age);

//        Human obj = (Human) context.getBean("human");
//        obj.code();

//        Desktop desk = context.getBean("desk1", Desktop.class);

    }
}
