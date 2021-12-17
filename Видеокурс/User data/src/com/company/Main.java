package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner str = new Scanner(System.in);

        System.out.println("Ваша строка: " + str.nextLine());
    }
}
