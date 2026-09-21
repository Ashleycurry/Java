package com.itheima.test;

public class StringBuilderTest2 {
    /*
        需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。
          调用该方法，并在控制台输出结果。
          例如：数组为int[] arr = {1,2,3};
          执行方法后的输出结果为：[1, 2, 3]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {

        if (arr == null || arr.length == 0) {
            return "[]";
        }

        // 创建StringBuilder对象, 用于拼接操作
        StringBuilder sb = new StringBuilder("[");

        // 遍历数组, 取出每一个元素 (排除最后一个)
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }

        // 单独添加最后一个元素, 拼接 ]
        sb.append(arr[arr.length - 1]).append("]");

        return sb.toString();
    }
}
