package com.itheima.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        // 通过Scanner从键盘录入学生的成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的成绩: ");
        int score = sc.nextInt();

        checkScore(score);

    }

    /*
        明确参数    int score
        明确返回值   void

        // 健壮性判断
        if (score < 0 || score > 100) {
            System.out.println("您输入的成绩有误, 请检查!");
            // 使用if语句, 判断成绩属于哪一段区间
        } else if (score >= 95) {
            // 打印出对应的奖励
            System.out.println("奖励自行车一辆");
        } else if (score >= 90) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80) {
            System.out.println("变形金刚玩具一个");
        } else {
            System.out.println("爱的教育");
        }
     */
    public static void checkScore(int score) {
        if (score >= 0 && score <= 100) {
            // 进一步判断, 该给什么奖励
            if (score >= 95) {
                // 打印出对应的奖励
                System.out.println("奖励自行车一辆");
            } else if (score >= 90) {
                System.out.println("游乐场玩一次");
            } else if (score >= 80) {
                System.out.println("变形金刚玩具一个");
            } else {
                System.out.println("爱的教育");
            }
        } else {
            // 给出错误提示
            System.out.println("您输入的分数有误, 请检查!");
        }
    }
}
