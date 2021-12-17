package com.company;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите целое число: ");
        int num1;
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();

        //if (num1 == 0)
        //{
        //    System.out.println("Ваше число = 0");
        //}
        //else if(num1 > 24 || num1 == 5)
        //{
        //    System.out.println("Ваше число > 24 или = 5");
        //}
        //else
        //{
        //    System.out.println("Ваше число != 0");
        //}

       // boolean myBool = num1 == 24 ? true : false;
        //
       // System.out.println("myBool = " + myBool);

        switch (num1)
        {
            case 51:
                System.out.println("Число = 51");
                break;
            case 52:
                System.out.println("Число = 52");
                break;
            default:
                System.out.println("Число != 51 и 52");
        }
    }
}
