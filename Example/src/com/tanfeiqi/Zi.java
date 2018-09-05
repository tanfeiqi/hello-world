package com.tanfeiqi;

/**
 * Created by tan on 2018/1/14.
 */
public class Zi extends Fu {

    int num = 8;

    Zi() {
        //super();
        System.out.println("父类初始化完毕后, num才进行显式初始化" + num);
    }

//    void show() {
//        System.out.println("zi show" + num);
//    }
}
