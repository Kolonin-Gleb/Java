package com.company;

public class Main {

    public static void main(String[] args)
    {
//        Computer pc = new Computer();
//
//        pc.i7.start();
//        pc.kingston.start();

        // Пример анонимного класса
        new Computer()
        {
            void superCom()
            {
                this.i7.start();
                this.kingston.start();
            }
        };
    }
}
