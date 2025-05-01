package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
    private List<Student> students;

    public StudentGrades() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int grade) {
        students.add(new Student(name, grade));
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }

        return (double) total / students.size();
    }

    public void printStudentsAboveAverage(double average) {
        System.out.println("Студенты с оценкой выше средней (" + average + "):");
        for (Student student : students) {
            if (student.getGrade() > average) {
                System.out.println(student.getName() + ": " + student.getGrade());
            }
        }
    }
}