package com.tanfeiqi;

/**
 * Created by tan on 2018/1/22.
 */
public class InnerClassDemo2 {

    int x = 4;

    public void show() {

//        int x = 3;

        class Inner2 {
            void run() {
                System.out.println("run.... " + x);
            }
        }

        Inner2 in = new Inner2();
        in.run();
    }
}
