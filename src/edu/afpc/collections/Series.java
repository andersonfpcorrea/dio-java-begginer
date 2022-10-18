package edu.afpc.collections;

import java.util.Objects;

public class Series implements Comparable<Series> {
    private String name;
    private String gender;
    private Integer time;

    public Series(String name, String gender, Integer time) {
        this.name = name;
        this.gender = gender;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(name, series.name) && Objects.equals(gender, series.gender) && Objects.equals(time, series.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, time);
    }

    @Override
    public int compareTo(Series serie) {
        int tempo = Integer.compare(this.getTime(), serie.getTime());
        if (tempo != 0) return time;
        return this.getGender().compareTo(serie.getGender());


    }
}