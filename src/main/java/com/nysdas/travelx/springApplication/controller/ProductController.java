package com.nysdas.travelx.springApplication.controller;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService theProductService) {
        productService = theProductService;
    }

    @GetMapping("/login")
    // add a mapping for "/login"
    public String getLoginPage() {
        return "products/login";
    }

    @GetMapping("/signup")
    public String getSignUpPage() {
        return "products/signup";
    }

    @GetMapping("/list")
    public String getAllProducts(Model theProductModel) {
        List<Product> theProducts = productService.findAll();
        theProductModel.addAttribute("products", theProducts);
        return "products/listAllProducts";
    }


    @GetMapping("/product")
    public String getAllProducts(@RequestParam(name = "page", defaultValue = "0") int page,
                                 @RequestParam(name = "size", defaultValue = "8") int size,
                                 Model theProductModel) {

        // Set up pagination
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> productPage = productService.findAllPaginated(pageable);

        // Get the list of products for the current page
        List<Product> theProducts = productPage.getContent();

        // Pass the list of products to the template
        theProductModel.addAttribute("products", theProducts);

        // Calculate the total number of pages
        int totalPages = productPage.getTotalPages();

        // Pass pagination information to the template
        theProductModel.addAttribute("currentPage", page);
        theProductModel.addAttribute("totalPages", totalPages);

        return "products/getAllProducts";
    }

}
