package com.tanfeiqi;

/**
 * Created by tan on 2018/1/6.
 */
public class Car {

    /**
     * 类: 事物的描述, 属性&行为
     * 对象: 类的实例
     */

    int num;

    String color;

    Car() {
        System.out.println("默认的构造函数");
    }

    /**
     * 构造函数
     * @param num
     */
    Car(int num) {
        this.num = num;
    }

    /**
     * 构造函数
     * @param n
     * @param c
     */
    Car(int n, String c) {
//        num = n;
        this(n);  //调用上一个构造函数, 必须放在第一行
        color = c;
        run();  //构造函数可以调用成员方法,但是成员方法不能调用构造函数
    }

    void run() {
        System.out.println(num + "," + color);
    }
}
