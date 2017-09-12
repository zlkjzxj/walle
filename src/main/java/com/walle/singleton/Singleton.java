package com.walle.singleton;

/**
 * 单例模式：饿汉模式
 * Created by Administrator on 2017/7/5.
 */
public class Singleton {

    //1.私有化构造方法，让外面不能new
    private Singleton(){

    }
    //2.创建一个实例对象
    private static Singleton instance= new Singleton();

    //3.穿件一个公共访问方法，供外界调用实例对象

    public static Singleton getInstance() {
        return instance;
    }
}
