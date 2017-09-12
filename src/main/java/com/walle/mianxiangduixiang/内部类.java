package com.walle.mianxiangduixiang;

/**
 * Created by zlkjzxj on 2017/7/11.
 */
class Outer {
    private String name = "walle";
    int age = 10;
    private static int score = 84;

    //成员内部类
    class InnerClass{
        String name ="david";
        public void show(){
            System.out.println("外部内的名字"+Outer.this.name);
            System.out.println("外部内的名字"+name);
            System.out.println("外部内的age"+age);
        }
    }
    //静态内部类
    static class InnerClass1{
        int score = 90;
        public void shows(){
            System.out.println("外部的分数"+Outer.score);
            System.out.println("外部类的名字"+new Outer().name);//访问外部类的非静态成员变量
            System.out.println("内部的分数"+score);
        }
    }
    //方法内部类
    public void methodClass(){
       final int aa = 0;
        class fuck{
            int aa =1;
            public void fucker(){
                System.out.println("外部方法中的常量aa"+aa);
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
