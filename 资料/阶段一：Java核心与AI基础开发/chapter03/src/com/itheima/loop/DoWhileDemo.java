package com.itheima.loop;

import java.util.Random;

public class DoWhileDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

        System.out.println("--------------------------");

        int i = 6;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i <= 5);

        Random r = new Random();

        for (int j = 1; j <= 30 ; j++) {
            System.out.println(r.nextInt(1, 10));
        }
    }
}
