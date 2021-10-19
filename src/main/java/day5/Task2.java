package day5;
// Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Honda", "black", 2021);
        System.out.println(moto.getModel());
        System.out.println(moto.getColor());
        System.out.println(moto.getRelease());

    }


}
class Motorbike {
    private String model;
    private String color;
    private int release;

public Motorbike (String model, String color, int release) {
    this.model = model;
    this.color = color;
    this.release = release;
}

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRelease() {
        return release;
    }
}
