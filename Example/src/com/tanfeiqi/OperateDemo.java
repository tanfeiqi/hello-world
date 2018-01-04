package com.tanfeiqi;

/**
 * Created by tan on 2018/1/5.
 */
public class OperateDemo {

    public static void main(String[] args) {
        /**
         * & 与 && 的区别: &&左边一旦false 右边不运算; &两边都要参与运算, &可以参与位运算
         * | 与 || 的区别: 同上
         */
        int x = 1;
        System.out.println(x>2&&x<5);

        System.out.println(x>2 || x <6);
    }
}
