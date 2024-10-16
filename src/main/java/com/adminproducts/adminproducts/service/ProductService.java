package com.adminproducts.adminproducts.service;

import com.adminproducts.adminproducts.model.Products;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Products saveProduct(Products product);

    public Optional<Products> findByProductId(int product_id);

    public void deleteProduct(int product_id);

    public List<Products> getAllProducts();

}
