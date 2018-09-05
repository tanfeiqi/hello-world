package com.tanfeiqi;

/**
 * Created by tan on 2018/1/22.
 */
public class InnerClassTest {

    public static void main(String[] args) {
        InnerClassDemo.Inner in = new InnerClassDemo().new Inner();
        in.run();

        new InnerClassDemo2().show();
    }
}
