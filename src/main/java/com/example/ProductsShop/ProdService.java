package com.example.ProductsShop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class ProdService {
    List<Product> list = new ArrayList<>();

    public ProdService() {
        list.add(new Product("Молоко", 100, 1));
        list.add(new Product("Масло сливочное", 200, 2));
        list.add(new Product("Хлеб ржаной", 80, 3));
    }

    public List<Product> getList() {
        return list;
    }

    public Product getProductById(int id) {

        for (Product product : list) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;// если не найден, вернуться на главную
    }

    public Object removeById(int id) {
        Product product = getProductById(id);
        if (product != null)
            list.remove(product);
        return null;
    }

    public Product getProductByNAme(String name) {

        for (Product product : list) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }

        }
        return null;
    }
}

