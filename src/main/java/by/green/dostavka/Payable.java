package by.green.dostavka;

public interface Payable {
    boolean canPay(CardBalance card);
}
