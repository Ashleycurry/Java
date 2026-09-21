package com.itheima.mif;

public class IfDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");

        int age = 19;

        if (age >= 18) {
            System.out.println("可以上网吧");
        } else {
            System.out.println("未成年人禁止入内");
        }

        System.out.println("结束");

        System.out.println("-----------------------");

        int num = 8;

        if (num == 1) {
            System.out.println("会员身份");
        } else if (num == 2) {
            System.out.println("非会员身份");
        } else {
            System.out.println("数据有误");
        }
    }
}
