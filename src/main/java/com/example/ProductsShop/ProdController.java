package com.example.ProductsShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdController {
    @Autowired
    ProdService prodService;

    @GetMapping("/")
    public String index1() {
        return "products";
    }

    @GetMapping("/products")
    public String index(Model model) {
        prodService.addProd();
        System.out.println(prodService.list);
        model.addAttribute("tab_prod", prodService.list);
        return "products";
    }

    @GetMapping("/pr")
    public String description(int id, Model model) {
        Product product=prodService.getProductById(id);
        if (product!=null){model.addAttribute("product",product);}
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
