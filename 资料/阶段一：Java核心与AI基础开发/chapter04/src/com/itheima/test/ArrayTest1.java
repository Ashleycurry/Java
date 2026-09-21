package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = {-11, -22, -33, -44, -55};
        int[] arr2 = {66, 77, 88, 99, 100};

        int sum = getSum(arr2);
        System.out.println("偶数和为:" + sum);

        int max = getMax(arr1);
        System.out.println("最大值为:" + max);

        reverseArray(arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    //需求: 请从数组中偶数元素取出并求和
    public static int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // arr[i] : 每一个元素
            // i : 代表索引
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    //需求: 从数组中找出最大值
    public static int getMax(int[] arr) {
        // 1. 假设数组中第一个元素为最大值
        int max = arr[0];
        // 2. 遍历数组, 取出剩余的每一个元素
        for (int i = 1; i < arr.length; i++) {
            // 3. 比较
            if (arr[i] > max) {
                // 4. 找到更大的元素, 改变max变量的值
                max = arr[i];
            }
        }
        // 5. 返回max的值
        return max;
    }

    //需求: 数组中第一个元素和最后一个元素交换
    public static void swap() {
        int[] arr = {11, 22, 33, 44, 55};
        // 第一个元素 arr[0]
        // 最后一个元素 arr[arr.length-1]
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //需求: 对数组中的元素反转
    public static void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
