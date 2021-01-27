package day6;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms. White", "Math");
        Student student = new Student("James Brown");
        teacher.evaluate(student);
    }
}

class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rnd = new Random();
        int grade = rnd.nextInt((5 - 2) + 1) + 2;
        System.out.println("Grade of " + student.name + " is " + grade);
        switch (grade) {
            case 2 -> System.out.println("Bad!");
            case 3 -> System.out.println("Satisfactory");
            case 4 -> System.out.println("Good");
            case 5 -> System.out.println("Perfect!");
        }
    }
}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}