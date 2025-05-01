package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        System.out.println("Введите фамилию и оценку студента :");


            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Неверный ввод. Пожалуйста, введите фамилию и оценку.");
                continue;
            }

            String name = parts[0];
            try {
                int grade = Integer.parseInt(parts[1]);
                if (grade < 0 || grade > 100) {
                    System.out.println("Оценка должна быть в диапазоне от 0 до 100.");
                    continue;
                }
                studentGrades.addStudent(name, grade);
            } catch (NumberFormatException e) {
                System.out.println("Оценка должна быть числом.");
            }
        }

        double average = studentGrades.calculateAverageGrade();
        System.out.printf("Средняя оценка: %.2f%n", average);

        studentGrades.printStudentsAboveAverage(average);

        scanner.close();
    }
}

