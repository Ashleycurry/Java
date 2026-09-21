package com.itheima.test;

public class WhileTest {
    /*
        需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？

        分析：
            1. 定义变量存储珠穆朗玛峰的高度、纸张的高度。
            2. 使用while循环来控制纸张折叠，循环条件是（纸张厚度<山峰高度）循环每执行一次，就表示纸张折叠一次，并把纸张厚度变为原来两倍
            3. 循环外定义计数变量count，循环每折叠一次纸张，让count变量+1
     */
    public static void main(String[] args) {
        int count = paper();
        System.out.println("对折的次数为:" + count);
    }

    public static int paper() {
        // 1. 定义变量存储珠穆朗玛峰的高度、纸张的高度。
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;

        // 2. 纸张厚度<山峰高度 就说明可以继续循环
        while(paperThickness < peakHeight){
            // 3. 对折
            paperThickness *= 2;
            // 4. 统计对折的次数
            count++;
        }

        return count;
    }
}
