package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class KeyPersonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"��ʼ��ս��");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"�ؼ�����ɱɱɱ");
        }
        System.out.println(Thread.currentThread().getName()+"������ս��");
    }
}
