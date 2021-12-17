package com.company;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        float num1, num2, result;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first num");
        num1 = userInput.nextFloat();

        System.out.println("Enter second num");
        num2 = userInput.nextFloat();

        System.out.println("Here is the sum of your numbers");
        result = num1 + num2;
        System.out.println(result);

        System.out.println("Here is the sum of your numbers minus 10");
        result -= 10;
        System.out.println(result);

        System.out.println("Here is the previous output + 1");
        System.out.println(result++);

        System.out.println(result);

    }
}
