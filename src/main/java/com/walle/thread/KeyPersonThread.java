package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class KeyPersonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始了战斗");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"关键人物杀杀杀");
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
