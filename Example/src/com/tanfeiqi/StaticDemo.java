package com.tanfeiqi;

/**
 * Created by tan on 2018/1/9.
 */
public class StaticDemo {

    static int n;

    /**
     * 静态代码块
     * 随着类的加载而执行, 而且只执行一次
     * 作用: 用于给类进行初始化
     */
    static {
        n=4;
        System.out.println("这是静态代码块");
    }

    /**
     * 构造代码块
     * 作用: 给所有对象进行初始化
     * 执行顺序先于构造函数
     */
    {
        System.out.println("这是构造代码块");
    }

    /**
     * 构造函数
     * 作用: 给对应的对象进行初始化
     */
    StaticDemo() {

    }

    void show() {
        System.out.println("test~~~");
    }
}
