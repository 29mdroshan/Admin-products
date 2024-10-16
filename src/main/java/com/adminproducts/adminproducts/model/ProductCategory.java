package com.adminproducts.adminproducts.model;

public enum ProductCategory {
    T_SHIRTS("tshirts"),
    SHIRTS("shirts"),
    JEANS("jeans"),
    FORMALS("formals"),
    SHOES("shoes"),
    BELTS("belts"),
    RAINWEAR_HOODIES("rainwear_hoodies");

    private final String key;

    ProductCategory(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
