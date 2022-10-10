package edu.afpc.collections;

public class Animals implements Comparable<Animals>{
    private final String name;
    private final Integer age;
    private final String color;

    public Animals (String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animals animals) {
        return this.getName().compareToIgnoreCase(animals.getName());
    }
}
