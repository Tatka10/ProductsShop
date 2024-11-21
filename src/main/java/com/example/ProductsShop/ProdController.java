package com.example.ProductsShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdController {

    @GetMapping("/")
    public String index() {
        return "products";
    }

    @GetMapping("/products")
    public String index1() {
        return "products";
    }

    @GetMapping("/product")
    public String caviarSalm(String id) {
        System.out.println(id);
        return "products";

    }

    @GetMapping("/product")
    public String caviarTrout(String id) {
        return "products";
//    @GetMapping("/product?id=2")
//    public String
    }
}
