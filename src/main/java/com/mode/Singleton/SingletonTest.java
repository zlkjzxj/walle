package com.mode.Singleton;

/**
 * Created by Administrator on 2017/7/5.
 */
public class SingletonTest {
    public static void main(String[] args) {

        //单例产生的对象都是一个对象，而new出来的对象都不一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1==singleton2);


        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();

        System.out.println(singleton3==singleton4);
    }
}
