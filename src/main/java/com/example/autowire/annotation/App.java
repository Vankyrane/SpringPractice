package com.example.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = applicationContext.getBean("employee", Employee.class);

        Manager manager = applicationContext.getBean("manager", Manager.class);

        System.out.println(manager.toString());
    }
}
