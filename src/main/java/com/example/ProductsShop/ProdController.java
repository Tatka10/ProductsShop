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
    public String index1(Model model) {
        System.out.println(prodService.list);
        model.addAttribute("tab_prod", prodService.getList());
        return "products";
    }

    @GetMapping("/products")
    public String index(Model model) {
        System.out.println(prodService.list);
        model.addAttribute("tab_prod", prodService.getList());
        return "products";
    }

    @GetMapping("/prInfo")
    public String getOneProduct(String id, Model model) {
        try {
            int y = Integer.parseInt(id);

            Product product = prodService.getProductById(y);
            if (product != null) {
                model.addAttribute("product", product);
            }
            System.out.println(id);
            return "prInfo";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "products";
        }
    }

    @GetMapping("/deletePr")
    public String deleteProductById(String id, Model model) {
        try {
            int y = Integer.parseInt(id);

            model.addAttribute("tab_prod",prodService.removeById(y));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


        return "index";}


}
