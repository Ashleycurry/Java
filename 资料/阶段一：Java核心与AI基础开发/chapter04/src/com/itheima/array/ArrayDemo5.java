package com.itheima.array;

import java.util.Random;

public class ArrayDemo5 {
    /*
        数组的初始化

            1. 静态初始化: 手动指定元素, 系统计算出数组的长度
                            int[] arr = {11,22,33,44,55};

                            使用场景: 要操作的数据, 需求中已经明确告知了
                            举例: 已知班级学生成绩为 90 100 100 20 10, 请找出最大值
                                    int[] arr = {90, 100, 100, 20, 10};

            2. 动态初始化: 手动指定长度, 系统会分配默认初始化值
                            int[] arr = new int[3];

                            使用场景: 不明确要操作的数据
                            举例: 产生10个1~100之间的随机数, 找出最大值

     */
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[10];

        System.out.println("产生的10个随机数为");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值为:" + max);

    }
}
