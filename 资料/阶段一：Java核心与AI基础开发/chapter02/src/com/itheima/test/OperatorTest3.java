package com.itheima.test;

public class OperatorTest3 {
    /*
        需求: 从三个整数中找出最大值
     */
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 10;

        // 1. 找出前两个整数的最大值
        int tempMax = a > b ? a : b;
        // 2. 找出三个整数的最大值
        int max = tempMax > c ? tempMax : c;

        System.out.println("最大值为:" + max);
    }
}
