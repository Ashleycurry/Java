package com.itheima.test;

import java.util.Scanner;

public class ArrayTest3 {
    /*
        需求：
            在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
            选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值
     */
    public static void main(String[] args) {
        // 1. 键盘录入6个评委给出的分数, 保存到数组
        int[] arr = initData();
        // 2. 求和
        int sum = getSum(arr);
        // 3. 找出最大值
        int max = getMax(arr);
        // 4. 找出最小值
        int min = getMin(arr);
        // 5. 计算平均值 (sum - max - min) / 4
        double avg = ((sum - max - min) * 1.0) / (arr.length - 2);

        System.out.println("平均值为:" + avg);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] initData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个评委的分数: ");
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个: ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("输入有误, 请重新输入0~100之间的分数: ");
                i--;
            }
        }

        return arr;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
