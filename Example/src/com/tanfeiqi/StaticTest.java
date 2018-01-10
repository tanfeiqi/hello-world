package com.tanfeiqi;

/**
 * Created by tan on 2018/1/9.
 */
public class StaticTest {

    static {
        System.out.println("我先执行");
    }

    public static void main(String[] args) {
        new StaticDemo().show();
        new StaticDemo().show();
    }
}
