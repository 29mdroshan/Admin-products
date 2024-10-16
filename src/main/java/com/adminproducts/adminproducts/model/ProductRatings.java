package com.adminproducts.adminproducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
@Component
public class ProductRatings {
    @Id
    private int id;
    private int productId;
    private double product_rating;
    private String customer_words;

}
