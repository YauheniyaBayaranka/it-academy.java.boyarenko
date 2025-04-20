package by.green.dostavka.card;

import by.green.dostavka.CardBalance;

public class Card implements CardBalance {

    private String cardholder;
    private double sum;

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

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardholder='" + cardholder + '\'' +
                ", sum=" + sum +
                '}';
    }
}
