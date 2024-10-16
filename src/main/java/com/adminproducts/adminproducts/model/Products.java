package com.adminproducts.adminproducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
@Component
public class Products {
    @Id
    private int product_id;
    private String product_name;
    private String product_desc;
    private int product_quantity;
    private String product_image;
    private ProductCategory product_category;
    private int product_price;
    private ProductBrand brandName;
    private List<String> brandSize;
}
