package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList(new MusicBand("Алиса", 1990),
                new MusicBand("Сплин", 1994), new MusicBand("Комиссар", 1991),
                new MusicBand("Стрелки", 1997), new MusicBand("Вирус", 1999),
                new MusicBand("Nirvana", 1967), new MusicBand("Shakira", 2000),
                new MusicBand("Jazin", 2009), new MusicBand("MGMT", 2005),
                new MusicBand("Linkin Park", 1996), new MusicBand("ДДТ", 1980)));
        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newGroupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                newGroupsAfter2000.add(band);
            }

        }
        return newGroupsAfter2000;
    }

}
