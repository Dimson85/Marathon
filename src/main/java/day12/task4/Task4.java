package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.printMembers;
import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("John Lennon");
        members2.add("Paul McCartney");
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        printMembers(band1);
        printMembers(band2);
        transferMembers(band1,band2);
        printMembers(band2);


    }
}
