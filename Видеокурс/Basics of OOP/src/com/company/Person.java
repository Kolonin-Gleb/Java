package com.company;
import java.lang.String;

public class Person
{
    public int height;
    public String name;

    public Person ()
    {
        height = 0;
        name = "Default";
    }

    public Person (int height, String name)
    {
        this.height= height;
        this.name = name;
    }

    public void info()
    {
        System.out.println("Height is " + height);
        System.out.println("Name is " + name);
    }

    public void say(String phrase)
    {
        System.out.println(phrase);
    }
}
