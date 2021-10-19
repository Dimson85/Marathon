package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        if (x <= -3) {
            System.out.println((double) 420);
        } else if (x > -3 && x < 5) {
            System.out.println((x + 3) * (Math.pow(x, 2) - 2));
        } else if (x >= 5) {
            System.out.println((Math.pow(x, 2) - 10) / (x + 7));
        }

    }
}
