package by.green.dostavka;

import by.green.dostavka.Cart.Cart;
import by.green.dostavka.Cart.CartItem;
import by.green.dostavka.card.Card;
import by.green.dostavka.catalog.Catalog;
import by.green.dostavka.catalog.CatalogCategory;
import by.green.dostavka.catalog.CatalogItem;
import by.green.dostavka.catalog.CatalogSubcategory;
import by.green.dostavka.product.*;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//1
        ProductInfo infoApple = new ProductInfo(1528941, " ", 2223768);
        Product apple = new Product("Яблоки свежие вес", "кг", 3.46);
        Product appleInfo = new Product("Яблоки свежие вес", "кг", 3.46, infoApple);
        //System.out.println(infoApple);
        //System.out.println(apple);
        System.out.println(appleInfo);

        ProductInfo infoApple1 = new ProductInfo(1593614, " ", 2228525);
        Product apple1 = new Product("Яблоко Голден вес 1кг", "кг", 3.50);
        Product appleInfo1 = new Product("Яблоко Голден вес 1кг", "кг", 3.50, infoApple1);
        //System.out.println(infoApple1);
        //System.out.println(apple1);
        System.out.println(appleInfo1);

        ProductInfo infoApple2 = new ProductInfo(1593616, " ", 2228527);
        Product apple2 = new Product("Яблоко Джеромини вес 1кг", "кг", 3.50);
        Product appleInfo2 = new Product("Яблоко Джеромини вес 1кг", "кг", 3.50, infoApple2);
        //System.out.println(infoApple2);
        //System.out.println(apple2);
        System.out.println(appleInfo2);
//2
        ArrayList<Product> apples = new ArrayList<>();

        apples.add(appleInfo);
        apples.add(appleInfo1);
        apples.add(appleInfo2);
        System.out.println(apples);
//3
        CatalogItem catalogItemApples = new CatalogItem("Яблоко", new Product[]{apple, apple1, apple2});
        System.out.println(catalogItemApples);
//4
        Product pear = new Product("Груша Оксана вес", "кг", 8.99);
        Product pear1 = new Product("Груша Конференция крупная", "кг", 8.99);
        Product pear2 = new Product("Груша Синго вес", "кг", 15.99);
//5
        ArrayList<Product> pears = new ArrayList<Product>();
        pears.add(pear);
        pears.add(pear1);
        pears.add(pear2);
        System.out.println(pears);
//6
        CatalogItem catalogItemPears = new CatalogItem("Груша", new Product[]{pear, pear1, pear2});
        System.out.println(catalogItemPears);
//7
        ArrayList<CatalogItem> fruits = new ArrayList<CatalogItem>();
        fruits.add(catalogItemApples);
        fruits.add(catalogItemPears);
        System.out.println(fruits);
//8
        CatalogSubcategory catalogSubcategoryFruits = new CatalogSubcategory("Фрукты",
                new CatalogItem[]{catalogItemPears, catalogItemApples});

        Product carrot = new Product("Морковь", "кг", 3.50);
        Product carrot1 = new Product("Морковь мытая", "кг", 7.50);
        Product potato = new Product("Картофель", "кг", 0.90);
        Product potato1 = new Product("Картофель мытый", "кг", 2.90);

        ArrayList<Product> carrots = new ArrayList<Product>();
        carrots.add(carrot);
        carrots.add(carrot1);
        System.out.println(carrots);

        CatalogItem catalogItemCarrot = new CatalogItem("Морковь", new Product[]{carrot, carrot1});

        ArrayList<Product> potatoes = new ArrayList<Product>();
        potatoes.add(potato);
        potatoes.add(potato1);

        CatalogItem catalogItemPotato = new CatalogItem("Картофель", new Product[]{potato, potato1});

        ArrayList<CatalogItem> vegetables = new ArrayList<CatalogItem>();
        vegetables.add(catalogItemCarrot);
        vegetables.add(catalogItemPotato);
        System.out.println(vegetables);

        CatalogSubcategory catalogSubcategoryVegetables = new CatalogSubcategory("Овощи ",
                new CatalogItem[]{catalogItemPotato, catalogItemPotato});
//9
        ArrayList<CatalogSubcategory> vegetablesFruits = new ArrayList<CatalogSubcategory>();

        vegetablesFruits.add(catalogSubcategoryFruits);
        vegetablesFruits.add(catalogSubcategoryVegetables);

        System.out.println(vegetablesFruits);
//10
        CatalogCategory catalogCategoryVegetablesFruits = new CatalogCategory("Овощи, фрукты",
                new CatalogSubcategory[]{catalogSubcategoryVegetables, catalogSubcategoryFruits});
        System.out.println(catalogCategoryVegetablesFruits);
//12
        System.out.println(Catalog.getProductsAsString(apples));
        System.out.println(Catalog.getProductsAsString(pears));
        System.out.println(Catalog.getProductsAsString(potatoes));
        System.out.println(Catalog.getProductsAsString(carrots));
//13
        System.out.println(Catalog.getCatalogItemAsString(catalogItemApples));
        System.out.println(Catalog.getCatalogItemAsString(catalogItemPotato));
        System.out.println(Catalog.getCatalogItemAsString(catalogItemPears));
        System.out.println(Catalog.getCatalogItemAsString(catalogItemCarrot));
//16
        Product carrotsProd = carrots.get(1);
        Product potatoesProd = potatoes.get(1);
        Product applesProd = apples.get(0);
        Product pearsProd = pears.get(1);

        System.out.println(applesProd);
        System.out.println(carrotsProd);
        System.out.println(potatoesProd);
        System.out.println(pearsProd);

        CartItem carrotsCartItem = new CartItem(carrotsProd, 2.5);
        CartItem potatoessCartItem = new CartItem(potatoesProd, 0.5);
        CartItem applesCartItem = new CartItem(applesProd, 3.5);
        CartItem pearsCartItem = new CartItem(pearsProd, 7.5);
//17
        ArrayList<CartItem> cartItems = new ArrayList<>();
        cartItems.add(carrotsCartItem);
        cartItems.add(potatoessCartItem);
        cartItems.add(applesCartItem);
        cartItems.add(pearsCartItem);
//18
        Cart cart = new Cart(cartItems);
        System.out.println(cartItems);
//19
        String result = cart.getCartCheckAsString();
        System.out.println(result);
//14
        List<CatalogItem> itemsList = List.of(catalogItemApples, catalogItemPears, catalogItemCarrot);
        String string = Catalog.getCatalogItemsAsString(itemsList);
        System.out.println(string);
//15
        CatalogSubcategory catalogSubcategory = new CatalogSubcategory("SubCategory1", new CatalogItem[]{catalogItemApples, catalogItemPears, catalogItemCarrot});
        System.out.println(Catalog.getCatalogSubCategoryAsString(catalogSubcategory));

        DairyProduct milk = new DairyProduct("Молоко коровье","пачка",2.50, 3);
        DairyProduct kefir = new DairyProduct("Кефир","пачка",2.00, 1);
        DairyProduct cheese = new DairyProduct("сыр","кг",5.60,45);
        System.out.println(milk);
        System.out.println(kefir);
        System.out.println(cheese);

        Egg egg = new Egg("Яйца куриные","упак",3.9,"C1");
        Egg egg1 = new Egg("Яйца перепелиные","упак",5.9,"C0");
        System.out.println(egg1);
        System.out.println(egg);

        IceCream iceCream = new IceCream("Мороженное пломбир ванильный","шт",1.6,50);
        IceCream iceCream2 = new IceCream("Мороженное пломбир шоколадный","шт",2.5,75);
        IceCream iceCream3 = new IceCream("Мороженное лед сок","шт",1.5,10);
        System.out.println(iceCream3);
        System.out.println(iceCream2);
        System.out.println(iceCream);

        Card card1 = new Card("Петров",800);
        Card card2 = new Card("Иванов",12000);
        System.out.println(card1);
        System.out.println(card2);

    }
}
