package com.itheima.test;

public class OperatorTest2 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x;        // x = 11  y = 11
        int z = y--;        // z = 11  y = 10

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("------------------------");

        int a = 3;
              // 4 + 4 + 50
        int b = (++a) + (a++) + (a * 10);
        System.out.println(a);      // 5
        System.out.println(b);      // 58
    }
}
