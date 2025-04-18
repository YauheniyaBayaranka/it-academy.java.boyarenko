package by.green.dostavka.product;

public class Product {

    public String name;
    public String unit;
    public double price;
    public ProductInfo info;

    // public ProductDescription description;

    public Product(String name, String unit, double price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public Product(String name, String unit, double price, ProductInfo info) {
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.info = info;
    }

    //public Product(String name, String unit, int price, ProductInfo info, ProductDescription description) {
    //  this.name = name;
    // this.unit = unit;
    // this.price = price;
    //  this.info = info;
    // this.description = description;


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", info=" + info +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductInfo getInfo() {
        return info;
    }

    public void setInfo(ProductInfo info) {
        this.info = info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




