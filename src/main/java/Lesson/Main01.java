package Lesson;

public class Main01 {
    public static void main(String[] args) {
        User user1 = new User("Admin","Admin");
        User user2 = new User("Admin","Admin");
        boolean isEqual = (user1.equals(user2));
        System.out.println(isEqual);
    }
}
