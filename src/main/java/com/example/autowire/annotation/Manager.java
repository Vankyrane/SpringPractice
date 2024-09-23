package com.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    //Field injection in Java
    @Autowired
    @Qualifier
    //@Qualifier is used when in large projects you have multiple beans of same Type and we want to make use of that particular bean.
    private Employee employee;

    //Constructor Injection in Spring
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
