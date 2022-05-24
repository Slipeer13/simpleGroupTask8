package com.example.simplegrouptask8.controller;

import com.example.simplegrouptask8.entity.Product;
import com.example.simplegrouptask8.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String showAllProducts(Model model) {
        List<Product> allProducts = productService.findAllProducts();
        model.addAttribute("products", allProducts);
        return "viewProduct";
    }

    @RequestMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id, Model model) {
        Product product = productService.findByIdProduct(id);
        if(product == null) {
            String message = "There is no product with id = " + id;
            model.addAttribute("exception", message);
            return "errorPage";
        }
        productService.deleteByIdProduct(id);
        return "redirect:/products";
    }

}
