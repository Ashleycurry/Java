package com.itheima.string;

import java.util.Scanner;

public class StringMethodDemo4 {
    /*
        1. String类的替换方法
                public String replace(旧值,新值) 替换
                注意点：返回值才是替换之后的结果
                需求：键盘录入一个字符串, 如果字符串中包含TMD, 则使用 *** 替换

        2. String类的切割方法
                public String[] split(String regex) ：根据传入的字符串作为规则进行切割
                将切割后的内容存入字符串数组中，并将字符串数组返回
     */
    public static void main(String[] args) {
        String s = "192+168+10+20";

        String[] arr = s.split("\\+");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void method() {
        String s = "itheima";
        String result = s.replace("heima", "baima");
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String msg = sc.next();
        msg = msg.replace("TMD", "***");
        System.out.println(msg);
    }
}
