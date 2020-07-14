package main.java.com.makkkkkkkks.family;

import java.util.Comparator;
import java.util.Map;

public class EmblemComparator implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {
        return family1.getValue().getNameOfEmblem().compareTo(family2.getValue().getNameOfEmblem());
    }
}
