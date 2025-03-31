package by.green.dostavka.product;

public class ProductInfo {
    public int article;
    public String importer;
    public  int barcode;

    public ProductInfo(int article, String importer, int barcode) {
        this.article = article;
        this.importer = importer;
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "article=" + article +
                ", importer='" + importer + '\'' +
                ", barcode=" + barcode +
                '}';
    }
}
