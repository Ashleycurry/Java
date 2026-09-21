package com.itheima.test;

import java.util.Scanner;

public class StringTest3 {
    /*
        需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
        最终效果为：156****1234

        1. 截取前三位        156
        2. 截取后四位        1234
        3. 拼接 ****        156 + "****" + 1234
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号: ");
        String tel = sc.next();

        // 1. 截取前三位
        String start = tel.substring(0, 3);
        // 2. 截取后四位
        String end = tel.substring(7);
        // 3. 拼接
        System.out.println(start + "****" + end);
    }
}
