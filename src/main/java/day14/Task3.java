package day14;
// Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический
// метод List<Person> parseFileToObjList(File file), который считывает содержимое того же файла people.txt,
// создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе main()
// и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
// в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
// необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("People")));

    }
    public  static List<Person> parseFileToObjList(File file){
        List<Person> persons = new ArrayList<>();
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

                }else {
                    persons.add(new Person(line[0],age ));
                }
            }
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return persons = null;

        }
        scanner.close();
        return persons;

    }
}
