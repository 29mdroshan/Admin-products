package com.adminproducts.adminproducts.repository.ProductRating;

import com.adminproducts.adminproducts.model.ProductRatings;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRatingRepo extends MongoRepository<ProductRatings, Integer> {
    Optional<ProductRatings> findByProductId(int productId);
}
