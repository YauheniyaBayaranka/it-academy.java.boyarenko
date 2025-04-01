package by.green.dostavka.card;

public class Card {

    String cardholder;
    double  sum;

    public Card(String cardholder, double sum) {
        this.cardholder = cardholder;
        this.sum = sum;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
