package com.myproject.dowhileDemo;

public class DowhileDemo {
    public static void main(String[] args) {
        // 案例一：基本 do...while 循环，打印 1 到 5
        System.out.println("=== 案例一：基本 do...while 循环 ===");
        int i = 1;
        do {
            System.out.println("第 " + i + " 次循环");
            i++;
        } while (i <= 5);

        System.out.println();

        // 案例二：do...while 求 1 到 100 的和
        System.out.println("=== 案例二：求 1 到 100 的和 ===");
        int sum = 0;
        int n = 1;
        do {
            sum += n;
            n++;
        } while (n <= 100);
        System.out.println("1 到 100 的和为：" + sum);

        System.out.println();

        // 案例三：do...while 至少执行一次，对比 while 的差异
        System.out.println("=== 案例三：至少执行一次的特性 ===");
        int count = 10;
        do {
            System.out.println("条件 count < 5 不满足，但循环体仍执行了一次，count=" + count);
            count++;
        } while (count < 5);
        System.out.println("循环结束后 count=" + count);
    }
}
