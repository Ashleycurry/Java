package com.myproject.type;

public class TypeConversionDemo {
    public static void main(String[] args) {
        // 自动类型转换
        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int i = 999;
        double j = i;
        System.out.println(i);
        System.out.println(j);

        char ch = 'b';
        int it = ch;
        System.out.println(ch);
        System.out.println(it);

        byte a1 = 110;
        byte a2 = 120;
        int a3 = a1 + a2;
        System.out.println(a3);

        byte test1 = 10;
        int test2 = 20;
        long test3 = 30;
        double result = test1 + test2 + test3;
        System.out.println(result);
    }
}
