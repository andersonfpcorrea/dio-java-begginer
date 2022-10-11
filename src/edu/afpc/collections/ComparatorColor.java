package edu.afpc.collections;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Animals> {

    @Override
    public int compare(Animals animal1, Animals animal2) {
        return animal1.getColor().compareToIgnoreCase(animal2.getColor());
    }
}
