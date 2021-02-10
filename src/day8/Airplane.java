package day8;

class Airplane {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2003, 24, 150);
        System.out.println(plane);

    }

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

    @Override
    public String toString(){
        return "Producer: " + producer + "\n" +
                "Year: " + year + "\n" +
                "Length: " + length + "\n" +
                "Weight: " + weight + "\n" +
                "Fuel: " + fuel + "\n";
    }
}
