package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationComponentScan.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);

        System.out.println(employee.toString());
    }
}
