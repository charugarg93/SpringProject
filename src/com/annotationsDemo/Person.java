package com.annotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Person {

    @Autowired
    private Car car;


    @Value("Sam")
    private String name;

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }






}
