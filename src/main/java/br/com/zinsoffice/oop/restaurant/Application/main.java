package br.com.zinsoffice.oop.restaurant.Application;

import br.com.zinsoffice.oop.restaurant.Domain.Product;
import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {

        Product piza = new Product("Pizza", BigDecimal.valueOf(29.99));

        System.out.println(piza.getName());
        System.out.println(piza.getUnitPrice());
    }
}
