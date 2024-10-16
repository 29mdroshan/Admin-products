package com.adminproducts.adminproducts.service;

import com.adminproducts.adminproducts.model.Products;
import com.adminproducts.adminproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSeviceImpl implements  ProductService{
    @Autowired
    ProductRepository productRepo;
    @Override
    public Products saveProduct(Products product) {
        return productRepo.save(product);
    }

    @Override
    public Optional<Products> findByProductId(int product_id) {
        return productRepo.findById(product_id);
    }

    @Override
    public void deleteProduct(int product_id) {
        productRepo.deleteById(product_id);
    }

    @Override
    public List<Products> getAllProducts() {
        return productRepo.findAll();
    }
}
