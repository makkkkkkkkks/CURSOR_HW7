package java.main.com.makkkkkkkks.family;

import java.util.Comparator;

public class EmblemComparator implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o1.getNameOfEmblem().length() - o2.getNameOfEmblem().length();
    }
}
