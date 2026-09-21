package com.myproject.forDemo;

public class ForDemo {
    public static void main(String[] args) {
        // 1. 基本 for 循环：打印 1 到 5
        System.out.println("=== 基本 for 循环 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("第 " + i + " 次循环");
        }

        // 2. 求 1 到 100 的和
        System.out.println();
        System.out.println("=== 求和 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 到 100 的和为：" + sum);

        // 3. 带标签的嵌套 for 循环：跳出外层循环
        System.out.println();
        System.out.println("=== 带标签的嵌套循环 ===");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j > 4) {
                    System.out.println("i=" + i + ", j=" + j + ", 乘积超过 4，跳出外层循环");
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // 4. 增强 for 循环（for-each）：遍历数组
        System.out.println();
        System.out.println("=== 增强 for 循环 ===");
        String[] fruits = {"苹果", "香蕉", "橙子"};
        for (String fruit : fruits) {
            System.out.println("水果：" + fruit);
        }
    }
}
