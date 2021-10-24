package day8;


public class Airplane {

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length < airplane2.length) {
            System.out.println(airplane2.producer + " длинее");
        } else if (airplane1.length > airplane2.length) {
            System.out.println(airplane1.producer + " длинее");
        } else {
            System.out.println("Длина самолетов одинаковая");
        }
    }


    public void info() {
        System.out.println("Изготовитель: " + producer + "," + " год выпуска: " + year + "," +
                " длина: " + length + "," +
                " вес: " + weight + "," +
                " количество топлива в баке: " + fuel);
    }

    public String toString () {
        return "Изготовитель: " + producer + "," + " год выпуска: " + year + "," +
                " длина: " + length + "," +
                " вес: " + weight + "," +
                " количество топлива в баке: " + fuel;
    }

    public void fillUp(int n) {
        fuel = fuel + n;

    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
