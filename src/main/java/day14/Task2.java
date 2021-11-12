package day14;
// Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей.
// Реализовать статический метод
//List<String> parseFileToStringList(File file), который считывает содержимое этого файла и возвращает список,
// состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main()
// и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
// выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
// необходимо выбрасывать исключение, выводить в консоль сообщение “Некорректный входной файл” и
// возвращать null или пустой список.
//
//Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
//
//
//Пример содержания файла people.txt:
//Mike 24
//John 19
//Anna 20
//Miguel 5

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("People");
        System.out.println(parseFileToStringList(file).toString());


    }

    public static List<String> parseFileToStringList(File file) {
        List<String> nameAge = new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        }
        while (scanner.hasNextLine()) {
            nameAge.add(scanner.nextLine());
        }
        String[] line = new String[2];
        int counter1 = 1;
        int counter2 = 0;
        int age;

        try {

        for (String inNameAge : nameAge) {
            line = inNameAge.split(" ");
            age = Integer.parseInt(line[1]);

            if (age < 0) {

                    throw new IOException();

                }
            }
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return nameAge = null;

        }
        scanner.close();
        return nameAge;
    }
}