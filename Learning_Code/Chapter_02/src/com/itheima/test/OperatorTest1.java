package com.itheima.test;

public class OperatorTest1 {
    public static void main(String[] args) {
        int num = 456;

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;

        System.out.println("整数" + num + "的个位为: " + ge);
        System.out.println("整数" + num + "的十位为: " + shi);
        System.out.println("整数" + num + "的百位为: " + bai);
    }
}
