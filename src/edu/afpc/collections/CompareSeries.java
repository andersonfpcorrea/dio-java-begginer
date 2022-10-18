package edu.afpc.collections;

import org.jetbrains.annotations.NotNull;

public class CompareSeries implements Comparable<Series>{
    public static void main(String[] args) {

    }
    @Override
    public int compareTo(Series s1, Series s2) {
        int name = s1.getName().compareTo(s2.getName());
        if (name != 0) return name;

        int gender = s1.getGender().compareTo(s2.getGender());
        if (gender != 0) return gender;

        return Integer.compare(s1.getTime(), s2.getTime());
    }
}
