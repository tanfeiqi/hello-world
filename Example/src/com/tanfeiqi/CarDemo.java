package com.tanfeiqi;

/**
 * Created by tan on 2018/1/6.
 */
public class CarDemo {

    public static void main(String[] args) {
        Car c = new Car(1);
        c.run();

        Car c1= new Car(2);
        Car c2 = c1;
        c2.num = 12;
        c2.color = "blue";

        c1 = null;
        c2.run();

        Car c3 = new Car(12, "red");
        c3.run();
    }
}
