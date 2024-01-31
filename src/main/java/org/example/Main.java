package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i = 1; i <=100; i++)
        {
            if (i % 3== 0 && i % 5==0)
            {
                System.out.println("FIzzBuzz");
            } else if(i %3 == 0)
            {
                System.out.println("Buzz");
            } else
            {
                System.out.println(i);
            }
        }
    }
}