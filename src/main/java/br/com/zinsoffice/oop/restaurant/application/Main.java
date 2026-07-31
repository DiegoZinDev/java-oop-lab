package br.com.zinsoffice.oop.restaurant.application;

import br.com.zinsoffice.oop.restaurant.domain.Product;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product pizza = new Product("Pizza", BigDecimal.valueOf(29.99));

        Product pizzaGrande = new Product("Pizza grande", BigDecimal.valueOf(39.99));

        System.out.print(pizza.getName()+ " -- ");
        System.out.println(pizza.getUnitPrice()+ "$");

        System.out.print(pizzaGrande.getName()+ " -- ");
        System.out.println(pizzaGrande.getUnitPrice()+ "$");
    }
}
