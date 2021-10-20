package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public void evaluate(Student student) {

        Random r = new Random();
        int grade = r.nextInt(4) + 2;
        String grade2 = "";
        switch (grade) {
            case 2:
                grade2 = grade2 + "неудовлетворительно";
                break;
            case 3:
                grade2 = grade2 + "удовлетворительно";
                break;
            case 4:
                grade2 = grade2 + "хорошо";
                break;
            case 5:
                grade2 = grade2 + "отлично";
                break;
        }
        System.out.println("Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + object + " на оценку " + "\"" + grade2 + "\"");

    }

    public String getName() {
        return name;
    }

    public String getObject() {
        return object;
    }
}
// "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ
// оценил студента с именем ИМЯСТУДЕНТА
// по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА.