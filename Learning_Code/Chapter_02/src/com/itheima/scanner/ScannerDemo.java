package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo {
    /*
        Scanner键盘录入的三个步骤:
            1. 导包
            2. 召唤精灵
            3. 指挥精灵干活
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄: ");
        int age = sc.nextInt();

        System.out.println("请输入您的姓名: ");
        String name = sc.next();

        System.out.println("姓名为" + name + ", 年龄为" + age);
    }
}
