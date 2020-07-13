package java.main.com.makkkkkkkks.family;

import java.util.Comparator;

public class TitleComparator implements Comparator<Family> {
    @Override
    public int compare(Family o1, Family o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
