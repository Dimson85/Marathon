package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2000, 2339, 200);
        Airplane airplane2 = new Airplane("Airbus", 2003, 2139, 210);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}