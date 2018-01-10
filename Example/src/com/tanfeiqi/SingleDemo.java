package com.tanfeiqi;

/**
 * Created by tan on 2018/1/9.
 * 设计模式 : 对问题行之有效的解决方式, 其实它是一种思想
 *
 * 1, 单例设计模式:
 *    解决的问题: 就是可以保证一个类在内存中的对象唯一性。
 *
 *    举例: 多个程序使用一个配置信息对象时, 就需要保证该对象的唯一性
 *
 *    步骤:
 *    1, 私有化该类的构造函数;
 *    2, 通过new在本类中创建一个本类对象;
 *    3, 定义一个公有的方法, 将创建的对象返回。
 */
public class SingleDemo {

    private static SingleDemo s = new SingleDemo();  //属于类的成员变量

    private SingleDemo() {

    }

    public static SingleDemo getInstance() {
        return s;
    }
}
