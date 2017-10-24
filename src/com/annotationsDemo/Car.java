package com.annotationsDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Value("Benz")
    private String carName;

    public String getCarName() {
        return carName;
    }
}
