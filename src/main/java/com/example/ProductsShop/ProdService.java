package com.example.ProductsShop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProdService {
    List<Product> list=new ArrayList<>();

    public List<Product> addProd(){
        list.add(new Product("Молоко", 100, 1));
        list.add(new Product("Масло сливочное", 200, 2));
        list.add(new Product("Хлеб ржаной", 80,3));
    return list;}

    public Product getProductById(int id){

    return list.stream().filter(x->x.id== id).map()
}

