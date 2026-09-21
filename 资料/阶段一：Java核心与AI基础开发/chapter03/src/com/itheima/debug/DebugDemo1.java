package com.itheima.debug;

public class DebugDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        int num1 = 10;
        int num2 = 20;
        int max = getMax(num1, num2);
        System.out.println("最大值为:" + max);
        System.out.println("结束");
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
