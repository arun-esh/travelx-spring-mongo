package com.nysdas.travelx.springApplication.controller;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController (ProductService theProductService){
        productService = theProductService;
    }

    @GetMapping("/list")
    public String getAllProducts(Model theProductModel){
        List<Product> theProducts = productService.findAll();
        theProductModel.addAttribute("products", theProducts);
        return "products/listAllProducts";
    }
}
