package com.adminproducts.adminproducts.Controller;

import com.adminproducts.adminproducts.model.Products;
import com.adminproducts.adminproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-controller")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Products saveProduct(@RequestBody Products product) {
        return service.saveProduct(product);
    }

    @GetMapping("/{product_id}")
    public Optional<Products> findByProductId(@PathVariable("product_id") int product_id) {
        return service.findByProductId(product_id);
    }

    @DeleteMapping("/{product_id}")
    public void deleteProduct(@PathVariable("product_id") int product_id) {
        service.deleteProduct(product_id);
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return service.getAllProducts();
    }
}
