package com.tanfeiqi;

/**
 * Created by tan on 2018/1/15.
 * 抽象类特点:
 * 1, 方法只有声明没有实现, 该方法是抽象方法, 需要abstract修饰
 * 2, 抽象方法定义在抽象类中, 该类必须被abstract修饰
 * 3, 抽象类不可以被实例化
 * 4, 抽象类必须有子类覆盖了所有的抽象方法, 否则还是抽象类
 *
 * 5, 抽象类可以有构造函数, 用于给子类初始化
 * 6, 抽象类可以没有抽象方法, 目的是不让该类创建对象
 * 7, 不能共存的关键词 private(子类不能override)、static(类方法无意义)、final(final修饰的方法不能被override, final修饰的类不能被继承)
 *
 *
 */
public abstract class AbstractDemo {

    AbstractDemo() {
        System.out.println("抽象类的构造器");
    }

    abstract void show();

    void sleep() {
        System.out.println("非抽象方法");
    }
}
