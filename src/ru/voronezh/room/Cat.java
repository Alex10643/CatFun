package ru.voronezh.room;

public class Cat {
    private String name;
    private double weight;
    private int age;

    public Cat (String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    public void changeWeight(double w) {
        weight = w;
    }

    public void meow() {
        System.out.println("Meow");

    }
}
