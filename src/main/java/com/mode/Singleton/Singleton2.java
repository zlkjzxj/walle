package com.mode.Singleton;

/**
 * 单例模式：懒汉模式
 * Created by Administrator on 2017/7/5.
 */
public class Singleton2 {

    private Singleton2(){}
    private static  Singleton2 instance ;

    public static Singleton2 getInstance() {
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }
}
