package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;

        double x = sc.nextDouble();
        if (x <= -3) {
            result = (double) 420;
            System.out.println(result);
        } else if (x > -3 && x < 5) {
            result = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(result);
        } else if (x >= 5) {
            result = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(result);
        }

    }
}
