package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class ArmyRunnable extends Thread{
    //volatile ��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
    //�ɼ������� ref JMM
   volatile boolean keepRunning=true;
    @Override
    public void run() {
        super.run();
        while(keepRunning){
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+"�����Է�"+i+"��");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"������ս��");
    }
}
