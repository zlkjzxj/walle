package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class Stage extends Thread {

    @Override
    public void run() {
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfSuiRevolt = new ArmyRunnable();

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"隋朝军队");
        Thread armyOfSuiRevolt = new Thread(armyTaskOfSuiRevolt,"农民起义军");

        //启动线程
        armyOfSuiDynasty.start();
        armyOfSuiRevolt.start();
        //舞台线程休眠
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        armyTaskOfSuiDynasty.keepRunning=false;
        armyTaskOfSuiRevolt.keepRunning=false;
        try {
            armyTaskOfSuiRevolt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("双方激战正酣，半路杀出个程咬金");
        Thread mrCheng = new KeyPersonThread();
        mrCheng.setName("程大侠");
        System.out.println("我来结束战争，，，，，，，，，，，，，，，，，，，，，，，杀杀杀杀");

        armyTaskOfSuiDynasty.keepRunning=false;
        armyTaskOfSuiRevolt.keepRunning=false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mrCheng.start();
        try {
            mrCheng.join();//这个运行完才会执行下面的代码
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("战争结束。。。。。。。。。。。。。。。。");
    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
