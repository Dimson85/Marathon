package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j;
        int min = 10;
        Random rnd = new Random();
        for (int num : arr) {
            num = rnd.nextInt(10);
            System.out.println(num);
            if (num < min) {
                min = num;
            }
        }
        System.out.println("мин = " + min);

    }
}
