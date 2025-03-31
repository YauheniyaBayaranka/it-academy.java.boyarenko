package by.green.dostavka.catalog;

import java.util.Arrays;

public class CatalogSubcategory {

    public String name;
    public CatalogItem[] items;

    public CatalogSubcategory(String name, CatalogItem[] items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public String toString() {
        return "CatalogSubcategory{" +
                "name='" + name + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
