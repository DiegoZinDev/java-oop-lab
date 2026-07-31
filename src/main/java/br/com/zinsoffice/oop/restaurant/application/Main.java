package br.com.zinsoffice.oop.restaurant.application;

import br.com.zinsoffice.oop.restaurant.domain.OrderItem;
import br.com.zinsoffice.oop.restaurant.domain.Product;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product pizza = new Product("Pizza", new BigDecimal("29.99"));

        Product pizzaGrande = new Product("Pizza grande", new BigDecimal("39.99"));

        Product pizzaExtraGrande = new Product("   Pizza Extra Grande   ", new BigDecimal("49.99"));

        OrderItem pedido1 = new OrderItem(pizza, 3);
        OrderItem pedido2 = new OrderItem(pizzaGrande, 4);
        OrderItem pedido3 = new OrderItem(pizzaExtraGrande, 2);

        //Pedido1
        System.out.println("Produto: " + pedido1.getProduct().getName());
        System.out.println("Quantidade: " + pedido1.getQuantity());
        System.out.println("Preço por U: R$ " + pedido1.getProduct().getUnitPrice());
        System.out.println("Subtotal: R$ " + pedido1.calculateSubtotal());
        System.out.println();

        //Pedido2
        System.out.println("Produto: " + pedido2.getProduct().getName());
        System.out.println("Quantidade: " + pedido2.getQuantity());
        System.out.println("Preço por U: R$ " + pedido2.getProduct().getUnitPrice());
        System.out.println("Subtotal: R$ " + pedido2.calculateSubtotal());
        System.out.println();

        //Pedido3
        System.out.println("Produto: " + pedido3.getProduct().getName());
        System.out.println("Quantidade: " + pedido3.getQuantity());
        System.out.println("Preço por U: R$ " + pedido3.getProduct().getUnitPrice());
        System.out.println("Subtotal: R$ " + pedido3.calculateSubtotal());
    }
}
