package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("上官玉米");
        list.add("李四");
        list.add("诸葛钢铁");
        list.add("王五");

        // 集合遍历的场景: 如果要实现的需求, 需要操作到集合中的每一个元素.
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.length() == 4) {
                System.out.println(name);
            }
        }

    }
}
