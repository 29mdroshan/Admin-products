package com.adminproducts.adminproducts.model;

public enum ProductBrand {
    DMNX("DNMX"),
    JOHN_PLAYERS("John Players"),
    TEAM_SPRITS("Team Sprits"),
    NETPLAY("Netplay"),
    PETER_ENGLAND("Peter England"),
    RED_TAPE("Red Tape"),
    WOODLANDS("Woodlands"),
    PUMA("Puma"),
    CAMPUS("CAMPUS"),
    ADIDAS("Adidas");

    private final String key;

    ProductBrand (String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
