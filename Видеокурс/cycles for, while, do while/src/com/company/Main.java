package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //for (int i = 0; i < 10; i++)
        //{
        //    System.out.println(i);
        //}

        //int j = 0;
        //while(j < 24)
        //{
        //    System.out.println(j);
        //    j++;
        //}

        //int x = 0;
        //do {
        //    System.out.println(x);
        //    x++;
        //}while(x == 0);

        //int y = 0;
        //while (true)
        //{
        //    System.out.println(y);
        //    y++;
        //    if (y == 7)
        //        return;
        //}

        int k = 0;
        while (k < 100)
        {
            k++;
            if (k % 2 == 0) // Если ост. от деления на 2 = 0, то наступает новая итерация,
                // а старая не завершается.
                continue;
            System.out.println(k);
        }
    }
}
