package com.tanfeiqi;

public class ExceptionDemo {

    public int method(int[] arr, int index) throws FuShuIndexException{
        if (index < 0) {
            throw new FuShuIndexException("角标为负数！！");
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        ExceptionDemo demo = new ExceptionDemo();

        try {
            int num = demo.method(arr, -1);
            System.out.println("num=" + num);
        }catch (FuShuIndexException e){
            System.out.println("出错了：角标为负数了");
            System.out.println("msg: " + e.getMessage());
            System.out.println("string: " + e.toString());
            e.printStackTrace();//jvm默认的异常处理机制就是调用这个方法
        }catch (Exception e){

        }// 多catch 父类catch放到最下面
        finally {
            System.out.println("over");
        }
    }
}
