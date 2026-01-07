package com.example.product_service.controllers;

import com.example.product_service.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String id) {
        // In a real application, this data would come from a database
        return new Product(id, "Sample Product", 99.99);
    }
}
