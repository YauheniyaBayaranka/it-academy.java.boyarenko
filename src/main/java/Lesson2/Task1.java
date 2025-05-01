package Lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] strNumbers = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < strNumbers.length; i++) {
            try {
                numbers.add(Integer.parseInt(strNumbers[i]));
            } catch (NumberFormatException e) {
                System.out.println("Элемент №" + i + " не число! Значение: " + strNumbers[i]);
            }
        }

        System.out.println(numbers);
    }
}
