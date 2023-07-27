package com.nysdas.travelx.springApplication.service;

import com.nysdas.travelx.springApplication.entity.Product;
import com.nysdas.travelx.springApplication.repository.ProductRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository theProductRepository) {
        productRepository = theProductRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String theId) {
        Optional<Product> result = productRepository.findById(theId);
        Product theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        } else {
            throw new RuntimeException("Did not find Product with id: " + theId);
        }
        return theProduct;
    }

    @Override
    public Product save(Product theProduct) {
        productRepository.save(theProduct);
        return theProduct;
    }

    @Override
    public void deleteById(String theId) {
        productRepository.deleteById(theId);
    }

    @Override
    public Page<Product> findAllPaginated(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public long countProducts() {
        return productRepository.count();
    }
}
