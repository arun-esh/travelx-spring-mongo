package com.nysdas.travelx.springApplication.repository;

import com.nysdas.travelx.springApplication.entity.Product;

import java.util.List;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{ 'name' : ?0 }")
    List<Product> findPaginated(int skip, int size);
}
