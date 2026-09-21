package com.myproject.whileDemo;

public class WhileDemo {
    public static void main(String[] args) {
        // 案例一：基本 while 循环，打印 1 到 5
        System.out.println("=== 案例一：基本 while 循环 ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("第 " + i + " 次循环");
            i++;
        }

        System.out.println();

        // 案例二：while 循环求 1 到 100 的和
        System.out.println("=== 案例二：求 1 到 100 的和 ===");
        int sum = 0;
        int n = 1;
        while (n <= 100) {
            sum += n;
            n++;
        }
        System.out.println("1 到 100 的和为：" + sum);

        System.out.println();

        // 案例三：do-while 循环，条件一开始就不满足也会执行一次
        System.out.println("=== 案例三：do-while 循环 ===");
        int count = 0;
        do {
            System.out.println("do-while 至少执行一次，当前 count=" + count);
            count++;
        } while (count < 0);
    }
}
