package com.tanfeiqi;

/**
 * Created by tan on 2018/1/9.
 */
public class SingleDemoTest {

    public static void main(String[] args) {
        SingleDemo s1 = SingleDemo.getInstance();
        SingleDemo s2 = SingleDemo.getInstance();
        System.out.println(s1==s2);
    }
}
