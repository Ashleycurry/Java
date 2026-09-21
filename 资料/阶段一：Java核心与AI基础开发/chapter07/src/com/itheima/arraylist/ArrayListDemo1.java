package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /*
        集合容器创建

        方案1: ArrayList list = new ArrayList();
                    可以存储任意数据类型, 不严谨

        方案2: ArrayList<String> list = new ArrayList<>();
                    使用泛型技术, 限制集合中元素的数据类型, 推荐方案.

        泛型的细节: 只能编写引用数据类型, 如果要存储 int, double, float... 需要使用包装类.

                        byte            Byte
                        short           Short
                        int             Integer     ***
                        long            Long
                        float           Float
                        double          Double
                        boolean         Boolean
                        char            Character   ***
     */
    public static void main(String[] args) {
        // 1. 创建集合容器, 存储 张三, 李四, 王五
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        // 2. 创建集合容器, 存储 11.1 22.2 33.3
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(11.1);
        list2.add(22.2);
        list2.add(33.3);

        System.out.println(list1);
        System.out.println(list2);
    }
}
