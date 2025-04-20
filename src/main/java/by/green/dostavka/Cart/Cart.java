package by.green.dostavka.Cart;

import by.green.dostavka.CardBalance;
import by.green.dostavka.Payable;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart implements Payable {
    public CartItem[] items;

    public Cart(CartItem[] items) {
        this.items = items;
    }

    public Cart(ArrayList<CartItem> cartItems) {
        this.items = new CartItem[cartItems.size()];

        for (int i = 0; i < cartItems.size(); i++) {
            this.items[i] = cartItems.get(i);
        }
    }

    public String getCartCheckAsString() {
        StringBuilder result = new StringBuilder("ВАША КОРЗИНА: \n");
        for (CartItem item : items) {
            result.append(String.format(" %s price %f * amount %f = TOTAL COST %f \n", item.product.getName(), item.product.getPrice(), item.getAmount(), item.product.getPrice() * item.getAmount()));
        }
        return result.toString();
    }



    @Override
    public String toString() {
        return "Cart{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    @Override
    public boolean canPay(CardBalance card) {
        return false;
    }
}
