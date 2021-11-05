package day12.task5;
//Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы
// есть не только имя, но и возраст. Соответственно, теперь под участником понимается не строка,
// а объект класса MusicArtist. Необходимо реализовать класс MusicArtist и доработать класс
// MusicBand (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist.
// После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
// проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль необходимо
// тоже переработать, чтобы они работали с объектами класса MusicArtist.

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static day12.task5.MusicBand.printMembers;
import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(new MusicArtist("Grace Slick",25),
                new MusicArtist("Marty Balin", 46), new MusicArtist("Paul Kantner", 56)) );

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

       List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(new MusicArtist("John Lennon", 52),
               new MusicArtist("Paul McCartney", 63)));

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        printMembers(band1);
        printMembers(band2);
        transferMembers(band1,band2);
        printMembers(band1);
        printMembers(band2);


    }

    }

