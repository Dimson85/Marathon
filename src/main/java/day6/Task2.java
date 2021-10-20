package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 1999, 25, 2345);

        airplane1.setLength(30);
        airplane1.setYear(2001);
        airplane1.fillUp(15);
        airplane1.fillUp(25);
        airplane1.info();

    }
}
