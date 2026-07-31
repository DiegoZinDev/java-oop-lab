package br.com.zinsoffice.oop.restaurant.Domain;

import java.math.BigDecimal;

public class Product {
    private final String name;
    private final BigDecimal unitPrice;

    public Product(String name, BigDecimal unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;

        if(name == null || !name.equals("Pizza") && !name.equals("Pizza grande")){
            throw new IllegalArgumentException("Invalid product name");
        }
        if(unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Invalid product unit price");
        }

    }
    public String getName() {
        return name;
    }
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }


}
