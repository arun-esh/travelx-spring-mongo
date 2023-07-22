package com.nysdas.travelx.springApplication.repository;

import com.nysdas.travelx.springApplication.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
