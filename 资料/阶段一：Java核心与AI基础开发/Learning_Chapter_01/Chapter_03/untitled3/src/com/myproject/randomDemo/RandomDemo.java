package com.myproject.randomDemo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        // 产生一个 1~100 之间的随机数作为中奖数字
        Random r = new Random();
        int luckyNum = r.nextInt(100) + 1;

        // 键盘录入用户猜的数字，猜对为止
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 猜数字游戏：范围 1~100 ===");
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guess = sc.nextInt();
            if (guess > luckyNum) {
                System.out.println("猜大了，往小一点试试~");
            } else if (guess < luckyNum) {
                System.out.println("猜小了，往大一点试试~");
            } else {
                System.out.println("恭喜你，猜对了！中奖数字就是 " + luckyNum);
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
