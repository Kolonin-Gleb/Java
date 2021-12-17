package com.company;

public class Computer
{
    // Приммер вложенного класса
    class Processor
    {
        private boolean isStart = false;

        public void start()
        {
            isStart = true;
        }
        public void shutDown()
        {
            isStart = false;
        }
    }

// Приммер вложенного класса
    class Ram
    {
        private boolean isStart = false;

        public void start()
        {
            isStart = true;
        }
        public void shutDown()
        {
            isStart = false;
        }
    }


    Processor i7 = new Processor();
    Ram kingston = new Ram();

}
