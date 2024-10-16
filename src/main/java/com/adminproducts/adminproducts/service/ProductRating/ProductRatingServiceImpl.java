package com.adminproducts.adminproducts.service.ProductRating;

import com.adminproducts.adminproducts.model.ProductRatings;
import com.adminproducts.adminproducts.repository.ProductRating.ProductRatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductRatingServiceImpl implements ProductRatingService {
    @Autowired
    ProductRatingRepo repo;
    @Override
    public ProductRatings saveProductRating(ProductRatings productRating) {
        return repo.save(productRating);
    }

    @Override
    public Optional<ProductRatings> findByProductId(int productId) {
        return repo.findByProductId(productId);
    }
}
