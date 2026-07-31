package br.com.zinsoffice.oop.restaurant.domain;

import java.math.BigDecimal;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {

        if (product == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        if(quantity <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior que zero");
        }

        this.product = product;
        this.quantity = quantity;
    }

    public BigDecimal calculateSubtotal(){
       BigDecimal subTotal;

        subTotal = product.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
        return subTotal;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
