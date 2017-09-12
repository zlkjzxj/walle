package com.walle.statics;

/**
 * Created by zlkjzxj on 2017/7/10.
 * 1.成员变量不需要初始化，局部变量要初始化
 * 2.作用范围不同
 * 2.局部变量可以重名
 * 3.两类变量重名时，局部有优先级
 */
public class Test {

    //定义一个成员变量，成员变量不需要初始化
    int var;

    void test(){
        int localVar = 0;//局部变量必须给初始值，否则使用会报错
        int var = 40;
        System.out.println("var:"+var);
        System.out.println("localVar:"+localVar);
    }

    public static void main(String[] args) {
        new Test().test();
    }
}
