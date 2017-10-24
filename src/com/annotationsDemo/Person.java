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

    @Resource(name="stockList")
    private List<String> stocklist;


    public List<String> getStocklist() {
        return stocklist;
    }

    @Value("Sam")
    private String name;

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }






}
