package com.tanfeiqi;


public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        //一维数组
        int[] arr = new int[4];
        System.out.println(arr);  //@右边是实体的hash值
        System.out.println(arr.length);

        //二维数组
        int[][] b = new int[3][2];
        b[1][1] = 4;
        System.out.println(b);
        System.out.println(b.toString());

        //二维不确定数组
        int[][] c = new int[3][];
        System.out.println(c);
        System.out.println(c[0]); // null
        //System.out.println(c[0][0]);  //null point

        int[][] d = {{3,2,10,15}, {12,23,1}, {1,2,12}};
        System.out.println(d.length);
        System.out.println(d[0].length);
        for(int i=0; i<d.length; i++) {
            for (int j=0; j<d[i].length; j++) {
                System.out.print(d[i][j] + ",");
            }
        }

        //接口的成员常量
        System.out.println("接口的成员常量是: " + InterfaceDemo.NUM);
    }
}

