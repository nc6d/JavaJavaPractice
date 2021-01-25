package day5;

public class task2 {
    public static void main(String[] args) {
        Motorbike moto0 = new Motorbike(2005, "Yellow", "Thunder");
        System.out.println(moto0.getYear());
        System.out.println(moto0.getColor());
        System.out.println(moto0.getModel());

    }
}

class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;

    }

    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public String getModel(){
        return this.model;
    }

}
