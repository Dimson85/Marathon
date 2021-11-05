package day12.task4;
//- Скопировать MusicBand из прошлого задания и доработать таким образом,
//   чтобы в группу можно было добавлять и удалять участников.
//   Под участником понимается строка (String) с именем и фамилией.
// - Реализовать статический метод слияния групп (в классе MusicBand),
//   т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
//   Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
// - В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль
//   и метод getMembers(), возвращающий список участников.
// - Проверить состав групп после слияния.

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }



    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers (MusicBand a, MusicBand b) {
        for (String member : a.getMembers()){
            b.getMembers().add(member);

        }
        a.getMembers().clear();

    }
    public static void printMembers(MusicBand a){
        System.out.println(a.getMembers());
    }

    @Override
    public String toString() {
        return  '{' + name  +
                " " + year +
                '}';
    }
}
