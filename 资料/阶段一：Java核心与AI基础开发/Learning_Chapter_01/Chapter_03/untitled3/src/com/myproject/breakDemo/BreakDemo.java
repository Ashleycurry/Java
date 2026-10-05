package com.myproject.breakDemo;

public class BreakDemo {
    public static void main(String[] args) {
        // 案例一：break 提前结束循环，找到目标后立即退出
        System.out.println("=== 案例一：找到目标就退出 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("找到 5，循环提前结束，i=" + i);
                break;
            }
            System.out.println("当前 i=" + i);
        }

        System.out.println();

        // 案例二：break 退出 while(true) 死循环
        System.out.println("=== 案例二：退出死循环 ===");
        int count = 1;
        while (true) {
            System.out.println("第 " + count + " 次执行");
            if (count == 3) {
                System.out.println("count 达到 3，执行 break 退出死循环");
                break;
            }
            count++;
        }

        System.out.println();

        // 案例三：带标签的 break 跳出多层嵌套循环
        System.out.println("=== 案例三：跳出多层循环 ===");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("i=" + i + ", j=" + j + "，跳出所有循环");
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println("循环已全部结束");
    }
}
