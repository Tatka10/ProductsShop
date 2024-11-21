package com.example.ProductsShop;

public class Product {
    String name;
    int price;
    String id;

    public Product(String name, int price, String id) {
        this.name = name;
        this.price = price;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
