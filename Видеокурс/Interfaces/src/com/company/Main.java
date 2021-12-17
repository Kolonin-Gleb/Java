package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Array interfaceObject = new MyArray();

        System.out.println(interfaceObject.add(24)); // 0 эл
        System.out.println(interfaceObject.add(86));
        System.out.println(interfaceObject.add(65));
        System.out.println(interfaceObject.add(17));
        System.out.println(interfaceObject.add(0)); // 4 эл
        System.out.println(interfaceObject.add(14)); // не хватает места
        // вывод
        System.out.println(interfaceObject.get(4));

    }
}
