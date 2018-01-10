package com.tanfeiqi;

/**
 * Created by tan on 2018/1/10.
 * 单例设计模式 : 懒汉式
 * 存在问题: 线程不安全
 */
public class SingleDemo2 {

    private static SingleDemo2 s = null;

    private SingleDemo2() {

    }

    public static SingleDemo2 getInstance() {
        if (s==null)
            s = new SingleDemo2();
        return s;
    }
}
