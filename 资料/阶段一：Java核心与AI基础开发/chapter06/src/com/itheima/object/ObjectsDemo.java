package com.itheima.object;

import com.itheima.pojo.Person;

import java.util.Objects;

public class ObjectsDemo {
    /*
        public static boolean isNull(Object obj) : 判断变量是否为 null
        public static boolean equals(Object a, Object b): 比较两个对象是否相同
                        - 底层依赖于我们自己重写的equals方法.
                        - 会帮我们进行非空判断.

        a 记录的是 p1对象
        b 记录的是 p2对象

        a 为 null        --> a != null --> false
                                            && 的特点, 左边为false, 右边不执行了.
                                            a 就不会调用equals方法了, 就避免了空指针异常.
        a 不为 null      --> a != null --> true
                                            && 的特点, 左边为true, 右边继续执行.
                                            a 就会调用equals方法, 和b进行比较了

        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }

        public static boolean equals(Object a, Object b) {
            if(a == b){
                return true;
            }

            if(a != null){
                return a.equals(b);
            }else{
                return false;
            }
        }
     */
    public static void main(String[] args) {
        Person p1 = null;
        Person p2 = new Person("张三", 23);

        System.out.println(Objects.equals(p1, p2));
    }
}
