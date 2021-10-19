package day5;
//1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Ferrari");
        car1.setColor("red");
        car1.setRelease(1970);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getRelease());

    }
}

     class Car {
        private String model;
        private String color;
        private int release;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getRelease() {
            return release;
        }

        public void setRelease(int release) {
            this.release = release;
        }
    }

