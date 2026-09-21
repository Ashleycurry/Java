package com.itheima.array;

public class ArrayDemo1 {
    /*
        数组静态初始化格式:

            1. 完整格式
                        数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3};
            2. 简化格式
                        数据类型[] 数组名 = {元素1, 元素2, 元素3};

        细节: 打印数组名, 看到的不是数组内容, 而是数组的十六进制内存地址

            [I@10f87f48

            @ : 分隔符
            [ : 当前的空间是数组类型
            I : 数组中元素的类型
            10f87f48 : 十六进制地址值(0 1 2 3 4 5 6 7 8 9 a b c d e f)
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 22, 33};
        double[] arr2 = {11.1, 22.2, 33.3};

        System.out.println(arr1);
        System.out.println(arr2);
    }
}
