package com.objectcontainers;

import java.util.Comparator;
/** class that compare the age of 2 persons in reverse order*/
public class ComparatorForAgeInReverseOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Persoane p1 = (Persoane) o1;
        Persoane p2 = (Persoane) o2;

        if (p1.getAge() > p2.getAge()) return -1;
        if (p1.getAge() < p2.getAge()) return 1;
        return 0;
    }


}
