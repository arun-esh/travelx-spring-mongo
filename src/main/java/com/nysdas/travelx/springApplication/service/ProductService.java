package com.nysdas.travelx.springApplication.service;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.repository.ProductRepository;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(String theId);

    Product save(Product theProduct);

    void deleteById(String theId);

}
