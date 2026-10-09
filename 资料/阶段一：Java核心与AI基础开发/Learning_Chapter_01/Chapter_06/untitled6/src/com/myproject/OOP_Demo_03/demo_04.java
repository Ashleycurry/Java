package com.myproject.OOP_Demo_03;

public class demo_04 {
    public static void main(String[] args) {
        // 案例：继承中的成员访问特点——就近原则
        System.out.println("=== 案例1：成员变量的访问特点（就近原则）===");
        Zi zi = new Zi();
        zi.show();

        System.out.println();

        // 案例2：成员方法的访问特点（就近原则 + 重写）
        System.out.println("=== 案例2：成员方法的访问特点 ===");
        // 1. 子类重写了 methodFu，通过子类对象调用的是子类重写后的版本
        zi.methodFu();

        // 2. 子类没有 methodFuOnly，会"就近"去父类中找并调用
        zi.methodFuOnly();

        // 3. 子类自己独有的方法，直接调用
        zi.methodZi();

        System.out.println();

        // 案例3：通过 super 调用父类被重写的原方法
        System.out.println("=== 案例3：super 调用父类的原方法 ===");
        zi.callFuMethod();

        System.out.println();

        // 案例4：继承中构造方法的特点——先执行父类构造，再执行子类构造
        System.out.println("=== 案例4：构造方法的特点（默认调用父类无参构造）===");
        Student s1 = new Student();

        System.out.println();

        // 案例5：通过 super(参数) 手动调用父类的带参构造
        System.out.println("=== 案例5：super(参数) 调用父类带参构造 ===");
        Student s2 = new Student("张三", 20);
        System.out.println("学生信息：" + s2.name + "，" + s2.age);
    }
}

// 父类
class Fu {
    int num = 10; // 父类成员变量（与子类同名）

    public void methodFu() {
        System.out.println("父类的 methodFu 方法");
    }

    public void methodFuOnly() {
        System.out.println("父类独有的 methodFuOnly 方法");
    }
}

// 子类：继承父类 Fu
class Zi extends Fu {
    int num = 20; // 子类成员变量（与父类同名）

    public void show() {
        int num = 30; // 局部变量（与成员变量同名）

        // 1. 直接写 num：就近原则——先找局部变量，再找子类成员变量，最后找父类成员变量
        System.out.println("直接访问 num（就近原则）：" + num);         // 30，局部变量

        // 2. this.num：明确访问"子类"的成员变量
        System.out.println("this.num（子类成员变量）：" + this.num);   // 20

        // 3. super.num：明确访问"父类"的成员变量
        System.out.println("super.num（父类成员变量）：" + super.num); // 10
    }

    // 成员方法访问特点：重写（子类覆盖父类的实现）
    @Override
    public void methodFu() {
        System.out.println("子类重写后的 methodFu 方法");
    }

    public void methodZi() {
        System.out.println("子类独有的 methodZi 方法");
    }

    // 通过 super 调用父类被重写的原方法
    public void callFuMethod() {
        super.methodFu(); // 访问父类的 methodFu（没有走重写版本）
    }
}

/*
 * 继承中构造方法的特点：
 * 1. 子类不能继承父类的构造方法（构造方法名必须与类名一致，父类的构造方法名是父类名）
 * 2. 子类构造方法的第一行默认隐藏了 super();——先调用父类的无参构造，再执行子类自己的构造
 * 3. 如果父类"没有"无参构造，子类必须手动写 super(参数) 调用父类的带参构造，否则编译报错
 * 4. super(参数) 和 this(参数) 都必须放在构造方法的第一行，所以二者不能同时出现
 */

// 父类：人（用于演示继承中构造方法的特点）
class Person {
    String name; // 姓名
    int age;     // 年龄

    // 父类无参构造方法
    public Person() {
        System.out.println("① 父类 Person 的无参构造方法执行了");
    }

    // 父类带参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("① 父类 Person 的带参构造方法执行了");
    }
}

// 子类：学生，继承 Person
class Student extends Person {

    // 子类无参构造：第一行默认隐藏 super();——调用父类无参构造
    public Student() {
        // 这里隐藏了一行代码：super();
        System.out.println("② 子类 Student 的无参构造方法执行了");
    }

    // 子类带参构造：手动用 super(参数) 调用父类的带参构造
    public Student(String name, int age) {
        super(name, age); // 父类没有无参构造时，这行必须手动写，否则编译报错
        System.out.println("② 子类 Student 的带参构造方法执行了");
    }
}
