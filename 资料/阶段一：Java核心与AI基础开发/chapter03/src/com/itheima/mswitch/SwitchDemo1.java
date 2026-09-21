package com.itheima.mswitch;

import java.util.Scanner;

public class SwitchDemo1 {
    /*
         switch语句格式 :

            switch (将要匹配的值) {
                case 值1:
                    语句体1;
                    break;
                case 值2:
                    语句体2;
                    break;
                ...
                default:
                    语句体n+1;
                    break;
            }

        执行流程:

            1. 拿着 () 中将要匹配的值, 跟case给出的选项, 逐个进行匹配
                    匹配成功, 执行对应的语句体, 再由break结束掉整个的switch语句
            2. 如果给出的所有case, 都匹配失败了, 将会执行最后的 default, 由break结束掉整个的switch语句

        需求: 键盘录入一个整数, 根据录入的数值, 程序打印出对应的星期
                1 ---> 星期一
                2 ---> 星期二
                ...
                7 ---> 星期日
                8 ---> 您的输入有误
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入: ");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("您的输入有误");
                break;
        }
    }
}
