package edu.afpc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOrdering {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>(){{
                add(new Animals("Tiger", 10, "black"));
                add(new Animals("Turtle", 50, "brown"));
                add(new Animals("Jaguar", 8, "gray"));
        }};
        System.out.println(animals);
        Collections.shuffle(animals);
        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);

        Collections.sort(animals, new ComparatorAge());
//        animals.sort(new ComparatorAge());
        System.out.println(animals);

//        Collections.sort(animals, new ComparatorColor());
        animals.sort(new ComparatorColor());
        System.out.println(animals);

        animals.sort(new ComparatorMany());
    }
}
