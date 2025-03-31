package by.green.dostavka;

import by.green.dostavka.Cart.Cart;
import by.green.dostavka.Cart.CartItem;
import by.green.dostavka.catalog.CatalogCategory;
import by.green.dostavka.catalog.CatalogItem;
import by.green.dostavka.catalog.CatalogSubcategory;
import by.green.dostavka.product.Product;
import by.green.dostavka.product.ProductInfo;

public class Main1 {

    public static void main(String[] args) {

        ProductInfo infoLemon = new ProductInfo(1450083, "ООО \"ГРИНрозница\"", 2218581);
        Product lemon = new Product("Лимон", "кг", 7.99);
        Product lemonInfo = new Product("Лимон", "кг", 7.99, infoLemon);
        //System.out.println(infoLemon);
        //System.out.println(lemon);
        System.out.println(lemonInfo);

        ProductInfo infoLimeWeight = new ProductInfo(1515242, " ООО \"ГРИНрозница\"", 2222356);
        Product limeWeight = new Product("Лайм вес", "кг", 9.99);
        Product limeWeightInfo = new Product("Лайм вес", "кг", 9.99, infoLimeWeight);
        //System.out.println(infoLimeWeight);
        //System.out.println(limeWeight);
        System.out.println(limeWeightInfo);

        ProductInfo infoFreshLemon = new ProductInfo(1566411, "ООО \"ГРИНрозница\"", 477902887);
        Product freshLemon = new Product("Лимон свежий фас", "шт", 5.99);
        Product freshLemonInfo = new Product("Лимон свежий фас", "шт", 5.99, infoFreshLemon);
        //System.out.println(infoFreshLemon);
        //System.out.println(freshLemon);
        System.out.println(freshLemonInfo);

        ProductInfo infoLimeImport = new ProductInfo(1505082, "Ян и Янина Фермерское хозяйство", 46100294);
        Product limeImport = new Product("Лайм фас. Импорт", "шт", 4.79);
        Product limeImportInfo = new Product("Лайм фас. Импорт", "шт", 4.79, infoLimeImport);
        //System.out.println(infoLimeImport);
        //System.out.println(limeImport);
        System.out.println(limeImportInfo);

        ProductInfo infoAvocadoMiniWeight = new ProductInfo(1519903, "ООО \"ГРИНрозница\"", 2222856);
        Product avocadoMiniWeight = new Product("Авокадо MiNI вес", "кг", 19.99);
        Product avocadoMiniWeightInfo = new Product("Авокадо MiNI вес", "кг", 19.99, infoAvocadoMiniWeight);
        //System.out.println(infoAvocadoMiniWeight);
        //System.out.println(avocadoMiniWeight);
        System.out.println(avocadoMiniWeightInfo);

        ProductInfo infoPineapple = new ProductInfo(1526446, " ", 2223530);
        Product pineapple = new Product("Ананас вес", "кг", 19.99);
        Product pineappleInfo = new Product("Ананас вес", "кг", 19.99, infoPineapple);
        //System.out.println(infoPineapple);
        //System.out.println(pineapple);
        System.out.println(pineappleInfo);

        ProductInfo infoOrange = new ProductInfo(1452256, " ООО \"ГРИНрозница\"",2218636 );
        Product  orange= new Product("Апельсин", "кг",5.99 );
        Product orangeInfo = new Product("Апельсин", "кг", 5.99, infoOrange);
        //System.out.println(infoOrange);
        //System.out.println(orange);
        System.out.println(orangeInfo);

        ProductInfo  infoCarrot = new ProductInfo(1443681, " АгроЛайнПлюс КФХ", 4814469);
        Product carrot = new Product("Морковь мытая Местное Известное Беларусь", "кг", 2.99);
        Product carrotInfo = new Product("Морковь мытая Местное Известное Беларусь", "кг", 2.99, infoCarrot);
        //System.out.println(infoCarrot);
        //System.out.println(carrot);
        System.out.println(carrotInfo);

        ProductInfo  infoBeet = new ProductInfo(1443682, " АгроЛайнПлюс КФХ",481446900);
        Product  beet = new Product("Свекла мытая Местное Известное Беларусь", "кг",2.99 );
        Product beetInfo = new Product("Свекла мытая Местное Известное Беларусь", "",2.99 , infoBeet);
        //System.out.println(infoBeet);
        //System.out.println(beet);
        System.out.println(beetInfo);

        ProductInfo  infoGarlic = new ProductInfo(1453948, " ООО \"ГРИНрозница\"",2218707);
        Product garlic = new Product("Чеснок", "кг", 15.99);
        Product garlicInfo = new Product("Чеснок", "", 15.99, infoGarlic);
        //System.out.println(infoGarlic);
        //System.out.println(garlic);
        System.out.println(garlicInfo);

        ProductInfo  infoCranberry = new ProductInfo(1407420, " Марков И.И. ИП",240000010);
        Product cranberry = new Product("Клюква лесная свежая Местное Известное Беларусь", "шт",6.99 );
        Product cranberryInfo = new Product("Клюква лесная свежая Местное Известное Беларусь", "шт",6.99 , infoCranberry);
        //System.out.println(infoCranberry);
        //System.out.println(cranberry);
        System.out.println(cranberryInfo);

        ProductInfo  infoStrawberry = new ProductInfo(1047742, " Фрукомп ООО",2204103);
        Product  strawberry= new Product("Клубника", "кг",6.99 );
        Product strawberryInfo = new Product("Клубника", "кг",6.99 , infoStrawberry);
        //System.out.println(infoStrawberry);
        //System.out.println(strawberry);
        System.out.println(strawberryInfo);

        ProductInfo  infoOyster = new ProductInfo(1565241, " ООО «ГриоБЕЛ» ",481281600);
        Product oyster = new Product("Грибы свежие Вешенка обыкновенная Местное известное", "шт",3.99 );
        Product oysterInfo = new Product("Грибы свежие Вешенка обыкновенная Местное известное", "шт",3.99 , infoOyster);
        //System.out.println(infoOyster);
        //System.out.println(oyster);
        System.out.println(oyster);

        ProductInfo infoChampignons = new ProductInfo(1447445, " Грибная страна КФХ",2218439);
        Product champignons= new Product("Грибы культивируемые свежие шампиньоны Первый сорт вес. Местное Известное Беларусь", "шт",10.99 );
        Product champignonsInfo = new Product("Грибы культивируемые свежие шампиньоны Первый сорт вес. Местное Известное Беларусь", "шт",10.99 , infoChampignons);
        //System.out.println(infoChampignons);
        //System.out.println(champignons);
        System.out.println(champignonsInfo);


        Product lemonPackagingInfo = new Product("Лимон вес,фасовка","шт",2.8);
        Product limePackagingInfo = new Product("Лайм вес,фасовка","шт",3.3 );
        System.out.println(lemonPackagingInfo);
        System.out.println(limePackagingInfo);

        CatalogItem lemonLime = new CatalogItem("Lemon, lime", new Product[]{lemonInfo, limeWeightInfo, freshLemon, limeImportInfo});
        CatalogItem itemVegetables = new CatalogItem("Oвощи", new Product[]{carrotInfo,beetInfo,garlicInfo });
        CatalogItem fruits = new CatalogItem("Fruits", new Product[]{avocadoMiniWeightInfo, pineappleInfo, orangeInfo});
        CatalogItem itemMushrooms = new CatalogItem("Грибы", new Product[]{oysterInfo, champignonsInfo });
        CatalogItem itemBerries = new CatalogItem("Ягоды", new Product[]{strawberryInfo,cranberryInfo});
        System.out.println(lemonLime);
        System.out.println(itemVegetables);
        System.out.println(fruits);
        System.out.println(itemBerries);
        System.out.println(itemMushrooms);

        CatalogSubcategory fruits1 = new CatalogSubcategory("Фрукты", new CatalogItem[]{ fruits });
        CatalogSubcategory vegetables = new CatalogSubcategory("Овощи", new CatalogItem[]{ itemVegetables });
        CatalogSubcategory mushrooms = new CatalogSubcategory("Грибы", new CatalogItem[]{itemMushrooms});
        CatalogSubcategory berry = new CatalogSubcategory("Ягоды", new CatalogItem[]{itemBerries});
        System.out.println(fruits1);
        System.out.println(vegetables);
        System.out.println(mushrooms);
        System.out.println(berry);

        CatalogCategory vegetablesFruitsMushroomsGreensBerries = new CatalogCategory("Овощи, фрукты, грибы, зелень, ягоды",new CatalogSubcategory[]{fruits1,vegetables,mushrooms,berry});
        System.out.println(vegetablesFruitsMushroomsGreensBerries);

        CartItem cartLimePackagingInfo = new CartItem(limePackagingInfo,0.3);
        CartItem cartLemonPackagingInfo =new CartItem(lemonPackagingInfo,0.35);
        System.out.println(cartLimePackagingInfo);
        System.out.println(cartLemonPackagingInfo);

        Cart cart1 = new Cart(new CartItem[]{cartLemonPackagingInfo, cartLimePackagingInfo});
        System.out.println(cart1);
    }
}
