package by.itakadimy.boyarenko;

public class Start {
    void start(int number) {
        if (number > 10 || number <= 0) {
            System.out.println("Start failed!");
        } else {
            while (number > 0) {
                System.out.println(number--);
            }
            System.out.println("Start!");
        }
    }
}
