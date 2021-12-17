package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Вызов static метода
        long sumResult = Math.sum(24, 86);

        //Вызов обычного метода
        Math obj = new Math();
        obj.mult(8, 8);


    }
}
