package edu.afpc.collections;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Animals> {

    @Override
    public int compare(Animals a1, Animals a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
