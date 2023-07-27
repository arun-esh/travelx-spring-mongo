package com.nysdas.travelx.springApplication.service;

import com.nysdas.travelx.springApplication.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(String theId);

    Product save(Product theProduct);

    void deleteById(String theId);

    Page<Product> findAllPaginated(Pageable pageable);

    long countProducts();
}
