package com.lodz360;

import org.springframework.stereotype.Component;

/**
 * Created by michalina on 10/08/16.
 */
public class Product implements ProductInterface {
    private String name;
    private double protain;
    private double fat;
    private double carbohydrates;

    public Product(String name, double protain, double fat, double carbohydrates) {

        this.name = name;
        this.protain = protain / 100;
        this.fat = fat / 100;
        this.carbohydrates = carbohydrates / 100;
    }

    public double getProtain() {
        return this.protain;
    }

    public double getFat() {
        return this.fat;
    }

    public double getCarbohydrates() {
        return this.carbohydrates;
    }

    public String getName() {return name; }
}
