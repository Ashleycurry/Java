package com.itheima.mswitch;

import java.util.Scanner;

public class SwitchDemo2 {
    /*
        switch语句注意事项:

            1. 表达式类型只能是byte、short、int、char 不支持double、float、long
                    JDK5开始支持枚举
                    JDK7开始支持String
            2. case 给出的值不允许重复，且只能是字面量，不能是变量
            3. 正常使用 switch 的时候，不要忘记写 break, 否则会出现穿透现象
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        String week = sc.next();

        switch (week) {
            case "1":
                System.out.println("星期一");
                break;
            case "2":
                System.out.println("星期二");
                break;
            default:
                System.out.println("您的输入有误");
                break;
        }
    }
}
