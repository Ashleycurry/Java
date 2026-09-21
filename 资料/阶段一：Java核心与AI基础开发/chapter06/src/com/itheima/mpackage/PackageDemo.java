package com.itheima.mpackage;

import java.util.*;

public class PackageDemo {
    /*
        包: 本质来说是文件夹, 用来管理类文件的.

        Scanner 类名
        java.util.Scanner 全类名

        一个类中, 需要使用不同的类, 但是这两个类名称是相同的
        默认只能导入一个, 另一个需要带包访问.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Random r = new Random();

        String s = sc.next();
        System.out.println();
    }
}
