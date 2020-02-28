package Lesson11;

import java.util.Comparator;

public class AutoPriceComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {

        //return o1.getPrice()-o2.getPrice();
        return o2.getPrice()-o1.getPrice();
        //return o1.getProducer().compareTo(o2.getProducer());
    }
}
