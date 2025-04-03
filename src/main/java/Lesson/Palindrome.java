package Lesson;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println(isPalindrome(in.nextLine()));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        final int LAST_CHARACTER_INDEX = str.length() - 1;
        final int MIDDLE_CHARACTER_INDEX = str.length() / 2;

        str = str.toLowerCase();
        for (int i = 0; i < MIDDLE_CHARACTER_INDEX; i++) {
            if (!isEqual(str.charAt(i), str.charAt(LAST_CHARACTER_INDEX - i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEqual(char firstChar, char secondChar) {
        return firstChar == secondChar;
    }
}
