package br.com.zinsoffice.oop.restaurant.application;

import br.com.zinsoffice.oop.restaurant.domain.Product;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product pizza = new Product("Pizza", new BigDecimal("29.99"));

        Product pizzaGrande = new Product("Pizza grande", new BigDecimal("39.99"));

        Product pizzaExtraGrande = new Product("   Pizza Extra Grande   ", new BigDecimal("49.99"));

        System.out.println(pizza.getName() + " -- R$" + pizza.getUnitPrice());
        System.out.println(pizzaGrande.getName() + " -- R$" + pizzaGrande.getUnitPrice());
        System.out.print(pizzaExtraGrande.getName() + " -- R$" + pizzaExtraGrande.getUnitPrice());
    }
}
