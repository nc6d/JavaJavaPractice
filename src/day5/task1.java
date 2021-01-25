package day5;

public class task1 {

    public static void main(String[] args) {

        Car car0 = new Car();

        car0.setYear(2010);
        car0.setColor("Green");
        car0.setModel("Fiesta");

        System.out.println(car0.getYear());
        System.out.println(car0.getColor());
        System.out.println(car0.getModel());

    }

}
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



}