package com.tanfeiqi;

/**
 * Created by tan on 2018/1/14.
 */
public class Fu {
    Fu() {
        show();  //先在子类中找方法
    }

   void show() {
        System.out.println("fu show");
    }
}
