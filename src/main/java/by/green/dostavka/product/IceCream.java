package by.green.dostavka.product;

public class IceCream extends Product{

    int sugar;

    public IceCream(String name, String unit, double price, int sugar) {
        super(name, unit, price);
        this.sugar = sugar;
    }
}
