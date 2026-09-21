package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
        ArrayList常用成员方法:

        1. 增
                boolean	add(E e): 将指定的元素追加到此列表的末尾
                void add(int index, E element): 将指定元素插入此列表中的指定位置
        2. 删
                E remove(int index): 删除此列表中指定位置的元素
                boolean	remove(Object o): 从该列表中删除指定元素的第一个匹配项（如果存在）
        3. 改
                E set(int index, E element): 用指定的元素替换此列表中指定位置的元素
        4. 查
                E get(int index): 返回此列表中指定位置的元素
                int	size(): 返回此列表中的元素数
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        String s = list.get(2);
        System.out.println(s);

        System.out.println(list.size());

    }

    private static void updateMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        list.set(1, "赵四");

        System.out.println(list);
    }

    private static void deleteMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("李四");
        list.add("张三");
        list.add("李四");
        list.add("王五");

        boolean result = list.remove("李四2");

        System.out.println(result);

        System.out.println(list);
    }

    private static void addMethod() {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("张三");
        list.add("张三");

        list.add(0, "李四");

        System.out.println(list);
    }
}
