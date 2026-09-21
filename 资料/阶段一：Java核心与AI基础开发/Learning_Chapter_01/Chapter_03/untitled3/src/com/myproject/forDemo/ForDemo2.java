package com.myproject.forDemo;

public class ForDemo2 {
    public static void main(String[] args) {
        // 案例一：嵌套循环打印 5 行 5 列的星号矩形
        System.out.println("=== 案例一：打印星号矩形 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 案例二：嵌套循环打印九九乘法表
        System.out.println("=== 案例二：九九乘法表 ===");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // 案例三：嵌套循环打印金字塔
        System.out.println("=== 案例三：打印金字塔 ===");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // 先打印每行前面的空格
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 再打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
