package by.green.dostavka.catalog;

import by.green.dostavka.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalog {
    public static String getProductsAsString(ArrayList<Product> products) {
        StringBuilder result = new StringBuilder("ПРОДУКТЫ:\n");
//       for (Product  product : products) {
//           result.append("-").append(product.getName()).append("\n");
//       }
//       return result.toString();
        return productListToString(products, result).toString();
    }

    ;

    public static String getCatalogItemAsString(CatalogItem catalogItem) {
        StringBuilder result = new StringBuilder("НАЗВАНИЕ:" + catalogItem.getName() + "\n");
//        for (Product product : catalogItem.getProducts()) {
//            result.append("-").append(product.getName()).append("\n");
//        }
//        return result.toString();
        return productListToString(List.of(catalogItem.getProducts()), result).toString();
    }

    public static String getCatalogItemsAsString(List<CatalogItem> catalogItems) {
        StringBuilder result = new StringBuilder();
        for (CatalogItem item : catalogItems) {
            result.append("НАЗВАНИЕ:").append(item.getName()).append("\n");
            productListToString(Arrays.asList(item.getProducts()), result);
        }
        return result.toString();
    }

    private static StringBuilder productListToString(List<Product> products, StringBuilder result) {
        for (Product product : products) {
            result.append("-").append(product.getName()).append("\n");
        }
        return result;
    }
}
