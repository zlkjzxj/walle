package com.walle.mianxiangduixiang;

/**
 * Created by zlkjzxj on 2017/7/11.
 */
class Outer {
    private String name = "walle";
    int age = 10;
    private static int score = 84;

    //��Ա�ڲ���
    class InnerClass{
        String name ="david";
        public void show(){
            System.out.println("�ⲿ�ڵ�����"+Outer.this.name);
            System.out.println("�ⲿ�ڵ�����"+name);
            System.out.println("�ⲿ�ڵ�age"+age);
        }
    }
    //��̬�ڲ���
    static class InnerClass1{
        int score = 90;
        public void shows(){
            System.out.println("�ⲿ�ķ���"+Outer.score);
            System.out.println("�ⲿ�������"+new Outer().name);//�����ⲿ��ķǾ�̬��Ա����
            System.out.println("�ڲ��ķ���"+score);
        }
    }
    //�����ڲ���
    public void methodClass(){
       final int aa = 0;
        class fuck{
            int aa =1;
            public void fucker(){
                System.out.println("�ⲿ�����еĳ���aa"+aa);
            }
        }
        fuck fuck = new fuck();
        fuck.fucker();
    }
    public static void main(String[] args) {
        Outer a = new Outer();
        InnerClass in=  a.new InnerClass();
        in.show();
        new InnerClass1().shows();
        new Outer().methodClass();
    }
}
