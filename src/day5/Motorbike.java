package day5;

import java.util.Scanner;

class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;

    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public void info() {
        System.out.println("It`s a motorbike");
    }

    public int yearDifference(int currentYear) {
        return currentYear - year;
    }

    public int inputYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year: ");
        return sc.nextInt();
    }


}
