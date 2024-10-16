package com.adminproducts.adminproducts.service.ProductRating;

import com.adminproducts.adminproducts.model.ProductRatings;

import java.util.Optional;

public interface ProductRatingService {
    public ProductRatings saveProductRating(ProductRatings productRating);

    public Optional<ProductRatings> findByProductId(int productId);
}
