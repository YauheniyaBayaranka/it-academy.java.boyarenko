package by.green.dostavka.product;

public class  DairyProduct extends Product {

    int fatContent;

    public DairyProduct(String name, String unit, double price, int fatContent) {
        super(name, unit, price);
        this.fatContent = fatContent;
    }
}
