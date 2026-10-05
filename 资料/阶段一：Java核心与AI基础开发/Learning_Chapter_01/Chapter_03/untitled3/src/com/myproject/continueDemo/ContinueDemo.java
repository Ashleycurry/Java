package com.myproject.continueDemo;

public class ContinueDemo {
    public static void main(String[] args) {
        // 案例：打印 1~10 之间的奇数（遇到偶数就跳过本次循环）
        System.out.println("=== 案例：跳过偶数，只打印奇数 ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // continue：跳过本次循环剩余代码，直接进入下一次循环
                continue;
            }
            // 只有奇数能执行到这里
            System.out.println("奇数：" + i);
        }
        System.out.println("循环正常结束 —— continue 只跳过本次，不会终止循环");
    }
}
