package com.itheima.test;

import com.itheima.tools.ArrayTools;

public class ArrayToolsTest {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        int max = ArrayTools.getMax(arr);
        int min = ArrayTools.getMin(arr);
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
        ArrayTools.printArray(arr);

    }
}
