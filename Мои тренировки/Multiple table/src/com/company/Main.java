package com.company;



public class Main
{
    public static void fill(int matrix[][], byte cols, byte rows)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = i * j;
            }
        }
    }

    public static void show(int matrix[][], byte cols, byte rows)
    {
        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j < cols; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Таблица умнодения: ");

        byte rows = 10;
        byte cols = 10;

         int multipleTable[][] = new int[rows][cols];

        fill(multipleTable, rows, cols);

        show(multipleTable, rows, cols);
    }
}
