package day7;

public class task1 {
    public static void main(String[] args) {
        Airplane plane0 = new Airplane("Boeing", 1995, 20, 220);
        Airplane plane1 = new Airplane("AN-143", 1973, 30, 150);
        Airplane.compareAirplanes(plane0, plane1);

    }

}

class Airplane {
    public String producer;
    public int year;
    public int length;
    public int weight;
    public int fuel = 0;

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

    static void compareAirplanes(Airplane plane0, Airplane plane1) {
        if (plane0.length > plane1.length)
            System.out.println("First plane is bigger. His length is: " + plane0.length);
        else if (plane0.length < plane1.length)
            System.out.println("Second plane is bigger. His length is: " + plane1.length);
        else System.out.println("Two planes are equal by their length - " + plane0.length);

    }
}
