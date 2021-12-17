package com.company;

public class MyArray implements Array
{
    int arr[] = new int[5];
    int size = 0;

    @Override
    public int get(int i)
    {
        return arr[i];
    }

    @Override
    public boolean add(int i)
    {
        if (size != arr.length)
        {
            arr[size] = i;
            size++;
            return true; // Эелемент успешно добавлен
        }
        else {
            return false; // Эелемент не был добавлен
        }
    }
}
