package com.itheima.permission;

import com.itheima.permission.demo.A;

public class PermissionDemo {
    /*
        权限修饰符:

            private         同一个类中
            (default)       同一个类中       同一个包中
            protected       同一个类中       同一个包中       不同包的子类
            public          任意位置
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.num);
        a.method();
    }
}
