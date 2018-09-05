package com.tanfeiqi;

/**
 * Created by tan on 2018/1/22.
 *
 * 1, 为什么内部类能直接访问外部类中的成员呢?
 * 因为内部类持有了外部类的引用,  外部类.this
 */
public class InnerClassDemo {

    private int num = 3;

    class Inner {
        private int num = 4;
        void run() {
            System.out.println("我是内部类 + num =  " + InnerClassDemo.this.num);
        }
    }

    void method() {
        Inner in = new Inner();
        in.run();
    }
}
