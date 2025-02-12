package ru.voronezh.room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        catGenerator();
    }

    public static void catGenerator() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type cat name: " );
        String nameGen = scan.next();

        System.out.print("Type " + nameGen +" weight: " );
        double weightGen = scan.nextDouble();

        System.out.print("Type " + nameGen +" age: " );
        int ageGen = scan.nextInt();

        Cat c1 = new Cat(nameGen, weightGen, ageGen);

        System.out.println(c1.getName());
        System.out.println(c1.getWeight());
        System.out.println(c1.getAge());
    }
}