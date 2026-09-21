package com.itheima.object;

import com.itheima.pojo.Student;

public class ObjectMethod {
    /*
        Object类: 所有的类都直接, 或者间接的继承了Object类.

        成员方法:
            public String toString(): 返回对象的字符串表示形式.

        细节:
            System.out.println(); 打印对象的时候, 源码中会自动调用该对象的toString方法.

            public static String valueOf(Object obj) {
                return (obj == null) ? "null" : obj.toString();
            }

        Object类的toString方法, 源码:

            对象的全类名@十六进制哈希值
            哈希值: 对象的整数表示形式, 常被人称作为地址值.

            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
     */
    public static void main(String[] args) {
        Student stu = new Student("张三", 23);
        System.out.println(stu);
    }
}
