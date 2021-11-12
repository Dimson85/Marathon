package day14;
// Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную десятью произвольными числами.
// Реализовать статический метод printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее на экран.
//Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
// Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить
// в консоль сообщение “Некорректный входной файл”.
//Вызвать данный метод в методе main().

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        final int NORMAL_LENGTH = 10;
        int res = 0;
        int counter = 0;
        int[] parseNum = new int[10];
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        if (numbers.length != NORMAL_LENGTH) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
        } else {
            for (String number : numbers) {
                parseNum[counter++] = Integer.parseInt(number);

            }
            for (Integer num : parseNum) {
                res += num;
            }
            System.out.println(res);
        }
        scanner.close();

    }
}
