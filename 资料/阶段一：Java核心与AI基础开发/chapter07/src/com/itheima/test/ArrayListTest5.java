package com.itheima.test;

import com.itheima.pojo.Student;

import java.util.ArrayList;

public class ArrayListTest5 {
    /*
        需求：定义一个方法，方法接收一个集合对象（泛型为Student）
                方法内部将年龄低于18的学生对象找出
                并存入新集合对象，方法返回新集合
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 14));
        list.add(new Student("王五", 15));

        ArrayList<Student> result = filterList(list);

        for (int i = 0; i < result.size(); i++) {
            Student stu = result.get(i);
            System.out.println(stu);
        }
    }

    private static ArrayList<Student> filterList(ArrayList<Student> list) {
        // 1. 创建新集合
        ArrayList<Student> result = new ArrayList<>();
        // 2. 遍历原集合, 取出每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            // 3. 判断该学生的年龄, 是否低于18岁
            if(stu.getAge() < 18){
                // 4. 存入新集合
                result.add(stu);
            }
        }
        // 5. 返回新集合
        return result;
    }


}
