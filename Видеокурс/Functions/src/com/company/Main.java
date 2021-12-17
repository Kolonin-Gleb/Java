package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Введите 1 целое число: ");
        int userNumber1 = userInput.nextInt();
        System.out.print("Введите 2 целое число: ");
        int userNumber2 = userInput.nextInt();

        long result = sum(userNumber1, userNumber2);
        System.out.println("Вот сумма ваших чисел: " + result);
    }

    public static int sum(int num1, int num2)
    {
        return num1 + num2;
    }
}
