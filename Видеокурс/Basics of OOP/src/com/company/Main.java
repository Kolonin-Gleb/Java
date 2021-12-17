package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Person person1 = new Person();

        person1.info();

        System.out.println("\n");

        Student student1 = new Student(170, "Neo", (byte) 11);

        student1.info();

    }
}
