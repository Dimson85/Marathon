package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        Random rnd = new Random();
        int sum = 0;
        int odd = 0;
        int even = 0;
        int one = 0;
        int eight = 0;


        for (int i = 0; i < a; i++) {
            arr[i] = rnd.nextInt(10);
        }
        for (int num : arr) {
            System.out.println(num);
            sum = sum + num;

            if (num > 8) {
                eight++;
            } else if (num == 1) {
                one++;
            } else if (num % 2 == 0) {
                even++;
            } else if (num % 2 != 0) {
                odd++;
            }


        }

        System.out.println("Длинна массива: " + arr.length + "+ 1");
        System.out.println("Количестве чисел больше 8: " + eight);
        System.out.println("Количестве чисел равных 1: " + one);
        System.out.println("Количестве нечетных чисел: " + odd);
        System.out.println("Количестве четных чисел: " + even);
        System.out.println("Сумме всех элементов массива: " + sum);

    }
}
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
