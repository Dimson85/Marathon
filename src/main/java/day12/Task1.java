package day12;
//1. Создать список строк, добавить в него 5 марок автомобилей,
// вывести список в консоль. Добавить в середину еще 1 автомобиль,
// удалить самый первый автомобиль из списка. Вывести список в консоль.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("BMW", "AUDI", "LADA", "HONDA", "NIVA"));
        System.out.println(list);
        list.add(2,"TOYOTA");
        list.remove(0);
        System.out.println(list);

    }
}
