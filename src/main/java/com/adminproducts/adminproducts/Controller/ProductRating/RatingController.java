package com.adminproducts.adminproducts.Controller.ProductRating;

import com.adminproducts.adminproducts.model.ProductRatings;
import com.adminproducts.adminproducts.service.ProductRating.ProductRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product-rating")
public class RatingController {

    @Autowired
    ProductRatingService service;

    @PostMapping
    public ProductRatings saveProductRating(@RequestBody ProductRatings productRating) {
        return service.saveProductRating(productRating);
    }

    @GetMapping("/{productId}")
    public Optional<ProductRatings> findByProductId(@PathVariable("productId") int productId) {
        return service.findByProductId(productId);
    }
}
