package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // Массив объектов унаследованных от класса Shape
        Shape arr[] = new Shape[]
                {new Circle(), new Square()};

        for (int i = 0; i < arr.length; i++)
        {
            arr[i].draw();
        }
    }
}
