package com.itheima.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    /*
        需求：键盘接受一个字符串，程序判断出该字符串是否是回文字符串，并在控制台打印是或不是
        回文字符串：123321、111
        非回文字符串：123123

        思路: 对接收到的字符串反转, 如果反转后的字符串, 和原字符串相同, 就是回文字符串

        String --- StringBuilder 的转换.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String content = sc.next();

        // 将String转换为StringBuilder调用内部的反转方法.
        StringBuilder sb = new StringBuilder(content);
        sb.reverse();

        // 判断是否是回文字符串
        // content: String类型
        // sb: StringBuilder类型
        if (content.equals(sb.toString())) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}
