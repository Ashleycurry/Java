package com.itheima.loop;

public class ForDemo3 {
    /*
        循环嵌套: 循环语句中, 继续出现循环语句
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "---" + j);
            }
        }

        System.out.println("-----------------------");

        // 外循环: 控制行数
        for (int i = 1; i <= 5; i++) {
            // 内循环: 控制列数
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
