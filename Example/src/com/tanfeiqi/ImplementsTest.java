package com.tanfeiqi;

/**
 * Created by tan on 2018/1/20.
 *
 * 1,类与接口是实现关系
 * 2,接口不可以实例化
 * 3,java不支持多继承, 但是可以多实现, 一个类可以实现多个接口
 */
public class ImplementsTest implements InterfaceDemo {

    public void show() {
        System.out.println("子类实现接口的抽象方法: Override!");
    }

    public static void main(String[] args) {
        ImplementsTest iml = new ImplementsTest();
        System.out.println(iml.NUM);
        System.out.println(ImplementsTest.NUM);
        System.out.println(InterfaceDemo.NUM);
    }
}
