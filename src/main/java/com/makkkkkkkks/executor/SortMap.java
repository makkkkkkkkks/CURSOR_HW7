package main.java.com.makkkkkkkks.executor;

import main.java.com.makkkkkkkks.family.Family;

import java.util.Comparator;
import java.util.Map;

public class SortMap {
   public static void sortAndShowMap(Map<Integer, Family> familyMap, Comparator<Map.Entry<Integer, Family>> comparator) {
        familyMap
                .entrySet()
                .stream()
                .sorted(comparator)
                .forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));
    }
}
