package day6;

import java.util.Scanner;

class Car {

    private int year;
    private String color;
    private String model;

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void info(){
        System.out.println("It`s a car");
    }
    public int yearDifference(int currentYear){
        return currentYear - year;
    }
    public int inputYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year: ");
        return sc.nextInt();
    }



}