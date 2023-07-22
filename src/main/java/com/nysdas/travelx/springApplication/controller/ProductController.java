package com.nysdas.travelx.springApplication.controller;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController (ProductRepository theProductRepository){
        productRepository = theProductRepository;
    }

    @GetMapping("/list")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
