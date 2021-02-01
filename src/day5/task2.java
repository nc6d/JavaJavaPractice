package day5;


public class task2 {
    public static void main(String[] args) {
        Motorbike moto0 = new Motorbike(2005, "Yellow", "Thunder");
        System.out.println(moto0.getYear());
        System.out.println(moto0.getColor());
        System.out.println(moto0.getModel());
        moto0.info();
        System.out.println("Year difference is: " + moto0.yearDifference(moto0.inputYear()));
    }
}

