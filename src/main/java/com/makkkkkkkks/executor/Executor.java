package main.java.com.makkkkkkkks.executor;

import main.java.com.makkkkkkkks.family.EmblemComparator;
import main.java.com.makkkkkkkks.family.Family;
import main.java.com.makkkkkkkks.family.TitleComparator;
import main.java.com.makkkkkkkks.number.NumberAddition;

import java.util.Map;
import java.util.TreeMap;

public class Executor {
    public static void startProgram() {
        Map<Integer, Family> familyMap = new TreeMap<>();
        familyMap.put(1, new Family("Ivanovi", 4, "ZZ", "BB"));
        familyMap.put(2, new Family("Romanuc", 5, "WW", "DD"));
        familyMap.put(3, new Family("Kravcovi", 10, "QQ", "FF"));
        familyMap.put(4, new Family("Kovalenko", 8, "AA", "GG"));
        familyMap.put(5, new Family("Shepel", 7, "BB", "KK"));
        familyMap.put(6, new Family("Romanenko", 5, "NN", "LL"));
        familyMap.put(7, new Family("Denisenko", 2, "MM", "MM"));
        familyMap.put(8, new Family("Ostapenko", 3, "HH", "PP"));
        familyMap.put(9, new Family("Levurda", 2, "JJ", "RR"));
        familyMap.put(10, new Family("Gnatyk", 3, "KK", "ZZ"));

        System.out.println("Source map:");
        familyMap.forEach((integer, family) -> System.out.println(integer + "  : " + family));

        System.out.println("Sort by name:");
        SortMap.sortAndShowMap(familyMap, Map.Entry.comparingByValue());

        System.out.println("Sort by title:");
        SortMap.sortAndShowMap(familyMap, new TitleComparator());

        System.out.println("Sort by  emblem:");
        SortMap.sortAndShowMap(familyMap, new EmblemComparator());

        NumberAddition.deleteNumbers();
    }
}




