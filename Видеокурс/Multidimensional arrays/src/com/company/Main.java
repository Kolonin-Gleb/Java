package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // 1 мерный массив
        float array[] = new float[] {12.23f, 254f, 3.18f, 4.78f};

        // 2-х мерный массив
        char array2d[][] = new char[3][3];

        array2d[0][0]= '8';

        System.out.println(array2d[0][0]);

        // 2-х мерный массив
        int [][] array2dd = {{1,2},
                            {3,4}};
    }
}
