package com.swe.project.entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    public String name;
    public double price;
    public boolean inStock;
    public Integer quantity;

    @ManyToOne
    @JoinColumn(name = "brandId")
    public Brand brand;

    @ManyToOne
    public Store store;


    @ManyToOne
    public User buyer;

    @ManyToMany
    public List<User> viewers;


    @JoinColumn(name = "categoryId")
    @ManyToOne
    public Category category;


    public Product() {
        this.name = "";
        this.price = 0.0;
        this.brand = null;
        this.category = null;
    }



    public Product(String name, double price, Category category, Integer quantity, Brand brand,Store s) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.category = category;
        this.inStock = true;
    }

    public Integer getId() {
        return this.productId;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setId(Integer id) {
        this.productId = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

