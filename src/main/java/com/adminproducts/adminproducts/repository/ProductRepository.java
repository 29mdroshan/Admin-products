package com.adminproducts.adminproducts.repository;

import com.adminproducts.adminproducts.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products,Integer> {
}
