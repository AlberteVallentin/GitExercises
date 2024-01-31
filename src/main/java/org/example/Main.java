package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("KAt");
            } else if (i % 3 == 0) {
                System.out.println("Mor");
            } else if (i % 5 == 0) {
                System.out.println("Stol");
            } else {
                System.out.println(i);
            }
        }
    }
}
