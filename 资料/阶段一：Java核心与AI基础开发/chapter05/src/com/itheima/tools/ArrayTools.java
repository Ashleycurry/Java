package com.itheima.tools;

/**
 * 这是一个数组的工具类, 内部提供了很多数组的便捷操作
 * 求最大值, 求最小值, 遍历打印数组
 * @version 1.0
 * @author ys
 */
public class ArrayTools {

    private ArrayTools(){}

    /**
     * 此方法可以从传入的数组中查找最大值并返回
     * @param arr 需要求最大值的数组
     * @return 返回找到的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 此方法可以从传入的数组中查找最小值并返回
     * @param arr 需要查找最小值的数组
     * @return 返回找到的最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 此方法遍历打印数组中的每一个元素
     * @param arr 需要遍历打印的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
