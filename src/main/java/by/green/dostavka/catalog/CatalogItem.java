package by.green.dostavka.catalog;

import by.green.dostavka.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    public String name;
    public Product[] products;

    public CatalogItem(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }
}
