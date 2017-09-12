package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class Actor extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"��һ����Ա");
        int count = 0;
        boolean flag = true;
        while(flag){
            System.out.println(getName()+"��̨�ݳ�"+(++count)+"��");
            if (count%10==0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(count==100){
                flag = false;
            }
        }
        System.out.println(getName()+"�ݳ�����");
    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("Mr.Thread");
        actor.start();
        Thread actress = new Thread(new Actress(),"Miss runnable");
        actress.start();
    }

}

class Actress implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName()+"��һ����Ա");
        int count = 0;
        boolean flag = true;
        while(flag){
            System.out.println(Thread.currentThread().getName()+"��̨�ݳ�"+(++count)+"��");
            if (count%10==0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(count==100){
                flag = false;
            }
        }
        System.out.println(Thread.currentThread().getName()+"�ݳ�����");
    }
}




