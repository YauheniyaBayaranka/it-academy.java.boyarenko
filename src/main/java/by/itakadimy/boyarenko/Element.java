package by.itakadimy.boyarenko;

public class Element {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        for (int element : arrayInt) {
            element *= element;
            System.out.println(element);
        }
        for (int valueInt : arrayInt) {
            System.out.println(valueInt);
        }

    }
}
