package day6;
//1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

class Car {
    private String model;
    private String color;
    private int release;
   public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs((inputYear - release));

    }

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

