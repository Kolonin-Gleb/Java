package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        //// Пример создания массива 1
        //int []arr;
        //arr = new int[10];

        //// Пример создания массива 1
        //int []arr1 = new int[] {1, 2, 3, 4, 5};

        Scanner userInput = new Scanner(System.in);

        int userArray[];
        byte arraySize;

        System.out.print("Введите размер массива: ");
        arraySize = userInput.nextByte();

        userArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            System.out.println("Введите "+ i +" элемент массива: ");
            userArray[i] = userInput.nextInt();
        }
        System.out.println("Вот ваш массив: ");
        for (int i = 0; i < arraySize; i++)
        {
            System.out.print(userArray[i] + "\n");
        }

    }
}
