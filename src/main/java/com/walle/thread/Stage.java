package com.walle.thread;

/**
 * Created by zlkjzxj on 2017/7/7.
 */
public class Stage extends Thread {

    @Override
    public void run() {
        ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
        ArmyRunnable armyTaskOfSuiRevolt = new ArmyRunnable();

        Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"�峯����");
        Thread armyOfSuiRevolt = new Thread(armyTaskOfSuiRevolt,"ũ�������");

        //�����߳�
        armyOfSuiDynasty.start();
        armyOfSuiRevolt.start();
        //��̨�߳�����
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
        System.out.println("˫����ս��������·ɱ������ҧ��");
        Thread mrCheng = new KeyPersonThread();
        mrCheng.setName("�̴���");
        System.out.println("��������ս������������������������������������������������ɱɱɱɱ");

        armyTaskOfSuiDynasty.keepRunning=false;
        armyTaskOfSuiRevolt.keepRunning=false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mrCheng.start();
        try {
            mrCheng.join();//���������Ż�ִ������Ĵ���
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ս��������������������������������������");
    }

    public static void main(String[] args) {
        new Stage().start();
    }
}
