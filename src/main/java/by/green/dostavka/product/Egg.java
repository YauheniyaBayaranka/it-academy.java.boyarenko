package by.green.dostavka.product;

public class Egg extends Product{

    String category;

    public Egg(String name, String unit, double price, String category) {
        super(name, unit, price);
        this.category = category;
    }
}
