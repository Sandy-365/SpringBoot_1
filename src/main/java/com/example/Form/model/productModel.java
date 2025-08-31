package com.example.Form.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class productModel {

    @NotNull(message = "Sandy")
    @Min(value=1,message = "MIN vaue")
    private Integer id;

    private String name;
    private double price;

    public productModel(){

    }

    public productModel(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
