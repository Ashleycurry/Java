package com.myproject.if_demo;

public class IfDemo {
    public static void main(String[] args) {
        // 目标：掌握分支结构 if 的三种格式

        // 需求1：if 单分支 —— 如果成绩大于等于60分，则输出提示信息
        int score = 85;
        if (score >= 60) {
            System.out.println("成绩合格，可以进入下一阶段的学习");
        }

        // 需求2：if-else 双分支 —— 判断一个整数是偶数还是奇数
        int number = 17;
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }

        // 需求3：if-else 多分支 —— 根据成绩划分等级
        int grade = 99;
        if (grade >= 90) {
            System.out.println("成绩等级：优秀");
        } else if (grade >= 80) {
            System.out.println("成绩等级：良好");
        } else if (grade >= 60) {
            System.out.println("成绩等级：及格");
        } else {
            System.out.println("成绩等级：不及格");
        }
    }
}
