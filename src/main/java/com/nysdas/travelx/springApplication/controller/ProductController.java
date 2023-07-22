package com.nysdas.travelx.springApplication.controller;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.repository.ProductRepository;
import com.nysdas.travelx.springApplication.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController (ProductService theProductService){
        productService = theProductService;
    }

    @GetMapping("/list")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }
}
