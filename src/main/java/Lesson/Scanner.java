package Lesson;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("Как тебя Зовут?");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!"+ " Меня зовут Том Редл. Я ученик Хогвартса. Как ты нашол мой дневник? ");
        String answer = scan.nextLine();
        System.out.println("Хм... Не знал, что я его там оставил. Ты прочитал его весь?");
    }
}