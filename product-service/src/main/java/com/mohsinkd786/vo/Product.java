package com.mohsinkd786.vo;

public class Product {

    public Product(int id, String sku, double price) {
        this.id = id;
        this.sku = sku;
        this.price = price;
    }

    private int id;
    private String sku;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
