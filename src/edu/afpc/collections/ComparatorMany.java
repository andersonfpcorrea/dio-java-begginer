package edu.afpc.collections;

import java.util.Comparator;

public class ComparatorMany implements Comparator<Animals> {
    @Override
    public int compare(Animals a1, Animals a2) {
        int name = a1.getName().compareToIgnoreCase(a2.getName());
        if (name != 0) return name;
        int color = a1.getColor().compareToIgnoreCase(a2.getColor());
        if (color != 0) return color;
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
