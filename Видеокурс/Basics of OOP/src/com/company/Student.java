package com.company;

public class Student extends Person
{
    byte course;

    public Student (int height, String name, byte course)
    {
        super(height,  name);
        this.course = course;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Course is " + course);
    }

    //@Override
    public void say(String phrase)
    {
        super.say(phrase + "\nI am a student!");
    }


}
