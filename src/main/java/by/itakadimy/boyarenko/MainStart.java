package by.itakadimy.boyarenko;

public class MainStart {
    public static void main(String[] args) {
        Start first = new Start();
        first.start(10);
        first.start(90);
        first.start(0);
        first.start(-100);
        first.start(9);

        Sum two = new Sum();
        // two.sum(5,6);
        // int a=5;
        // int b=1;
        int result = two.sum(5, 6);
        // System.out.println("Сумма " + a + " и " + b + " равна: " + result);
        System.out.println("Сумма " + result);
        // System.out.println("Сумма "  + two.sum

    }

}
