package com.car.components;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
    private String brand = "DefaultWheel";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Wheel{brand='" + brand + '\'' + '}';
    }
}
