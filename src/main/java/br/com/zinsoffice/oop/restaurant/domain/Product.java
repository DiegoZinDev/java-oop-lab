package br.com.zinsoffice.oop.restaurant.domain;

import java.math.BigDecimal;

public class Product {
    private final String name;
    private final BigDecimal unitPrice;

    public Product(String name, BigDecimal unitPrice){

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid product name");
        }
        if(unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Invalid product unit price");
        }

        this.name = name.trim();
        this.unitPrice = unitPrice;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }


}
