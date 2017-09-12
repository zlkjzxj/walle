package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class ArmyRunnable extends Thread{
    //volatile 保证了线程可以正确的读取其他线程写入的值
    //可见性问题 ref JMM
   volatile boolean keepRunning=true;
    @Override
    public void run() {
        super.run();
        while(keepRunning){
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+"进攻对方"+i+"次");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
