package by.green.dostavka.catalog;

import java.util.Arrays;

public class CatalogCategory {

    public String name;
    public CatalogSubcategory[] subcategories;

    public CatalogCategory(String name, CatalogSubcategory[] subcategories) {
        this.name = name;
        this.subcategories = subcategories;
    }

    @Override
    public String toString() {
        return "CatalogCategory{" +
                "name='" + name + '\'' +
                ", subcategories=" + Arrays.toString(subcategories) +
                '}';
    }
}
