package day6;

public class task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("AN", 1994, 34, 2500);
        plane.fillUp(100);
        plane.info();
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Producer: " + producer +
                "\nMade in year: " + year +
                "\nLength: " + length +
                "\nWeight: " + weight +
                "\nFuel tank capacity: " + fuel);
    }

    public void fillUp(int tank) {
        fuel += tank;
    }
}
