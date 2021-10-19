package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = sc.nextInt();
        if (floors > 0 && floors < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floors >= 5 && floors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floors > 8) {
            System.out.println("Многоэтажный дом");
        } else if (floors < 1) {
            System.out.println("Ошибка ввода");
        }
    }
}
