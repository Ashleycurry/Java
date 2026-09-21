package com.myproject.switch_demo;

public class SwitchDemo {
    public static void main(String[] args) {
        // 目标：掌握 switch 分支结构的用法

        // 需求1：根据输入的星期数字（1-7），输出对应的星期名称
        int week = 5;
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
                System.out.println("数字不合法，请输入1-7");
        }

        // 需求2：利用 case 穿透特性，根据月份判断所属季节
        int month = 3;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + "月是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "月是秋季");
                break;
            default:
                System.out.println("月份不合法，请输入1-12");
        }
    }
}
