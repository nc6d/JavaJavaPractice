package day6;

import day6.Car;
import day6.Motorbike;

public class task1 {

    public static void main(String[] args) {

        Car car0 = new Car();

        car0.setYear(2010);
        car0.setColor("Green");
        car0.setModel("Fiesta");

        System.out.println(car0.getYear());
        System.out.println(car0.getColor());
        System.out.println(car0.getModel());

        car0.info();
        System.out.println("Year difference is: " + car0.yearDifference(car0.inputYear()));

        Motorbike moto0 = new Motorbike(2005, "Yellow", "Stunner");
        moto0.info();
        System.out.println("Year difference is: " + moto0.yearDifference(car0.inputYear()));

    }

}
