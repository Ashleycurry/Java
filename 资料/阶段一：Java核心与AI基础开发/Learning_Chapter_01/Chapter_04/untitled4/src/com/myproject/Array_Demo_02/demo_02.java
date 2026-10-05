package com.myproject.Array_Demo_02;

public class demo_02 {
    public static void main(String[] args) {
        // 案例：数组元素访问——取值、修改、遍历
        // 访问格式：数组名[索引]，索引从 0 开始，范围 0 ~ length-1
        System.out.println("=== 案例：数组元素访问 ===");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("数组长度为：" + arr.length);

        // 1. 取值：通过索引读取元素
        System.out.println("第一个元素 arr[0] = " + arr[0]);
        System.out.println("第三个元素 arr[2] = " + arr[2]);
        System.out.println("最后一个元素 arr[arr.length - 1] = " + arr[arr.length - 1]);

        // 2. 修改：给指定索引重新赋值
        arr[1] = 200;
        System.out.println("修改后 arr[1] = " + arr[1]);

        // 3. 遍历访问：循环依次取出每个元素
        System.out.print("全部元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
