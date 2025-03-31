package by.green.dostavka.Cart;

import by.green.dostavka.product.Product;

public class CartItem {

    public Product product;
    public double amount;

    public CartItem(Product product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", amount=" + amount +
                '}';
    }
}

