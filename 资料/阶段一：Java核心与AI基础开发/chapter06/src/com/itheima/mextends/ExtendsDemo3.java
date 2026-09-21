package com.itheima.mextends;

public class ExtendsDemo3 {
    /*
        方法重写的使用场景:
            子类继承了父类的方法, 但是子类不想原封不动的继承父类的方法逻辑, 想要修改或者是增强, 就可以重写父类方法.

        方法重载(Overload): 在同一个类中, 方法名相同, 参数不同, 与返回值无关
                                参数不同: 个数不同, 类型不同, 顺序不同.

        方法重写(Override): 在子父类中, 出现了方法声明完全一致的方法
                                (方法名, 参数, 返回值都需要和父类保持一致)

     */
    public static void main(String[] args) {
        Son s = new Son();
        s.love();
    }
}

class Father {
    void love() {
        System.out.println("送花");
        System.out.println("送自行车");
        System.out.println("送冰箱");
    }
}

class Son extends Father {
    @Override       // Override注解: 校验当前方法, 是否是重写的方法
    public void love() {
        super.love();
        System.out.println("送口红");
        System.out.println("送包");
    }
}