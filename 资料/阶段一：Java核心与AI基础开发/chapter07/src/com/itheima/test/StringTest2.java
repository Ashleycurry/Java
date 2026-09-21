package com.itheima.test;

import java.util.Scanner;

public class StringTest2 {
    /*
        需求 : 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        (不考虑其他字符)

        例如 :  aAb3&c2B*4CD1

        小写字母 : 3个
        大写字母 : 4个
        数字字母 : 4个
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String content = sc.next();

        // 1. 定义三个计数器变量
        int smallCount = 0;
        int bigCount = 0;
        int numCount = 0;
        // 2. 将字符串转换为字符数组
        char[] arr = content.toCharArray();
        // 3. 遍历字符数组, 获取每一个字符
        for (int i = 0; i < arr.length; i++) {
            // 4. 判断当前字符是哪一种
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                // 5. 对应的计数器自增
                smallCount++;
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                bigCount++;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                numCount++;
            }
        }
        // 6. 遍历结束后, 打印计数器的值
        System.out.println("小写字母: " + smallCount);
        System.out.println("大写字母: " + bigCount);
        System.out.println("数字字符: " + numCount);
    }
}
