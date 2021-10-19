package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        int i = 1;
        while (i < 6) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            i++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }

    }
}
