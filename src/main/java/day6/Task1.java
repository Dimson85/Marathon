package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setRelease(1980);
        car1.info();
        System.out.println(car1.yearDifference(2000));


        Motorbike moto = new Motorbike("Ferrari", "red", 1970);
        moto.info();
        System.out.println(moto.yearDifference(1900));


    }
}
