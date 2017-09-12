package com.walle.reflect;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Test {



    public static void main(String[] args) {
        Foo foo = new Foo();

        Class c1 = Foo.class;

        Class c2 = foo.getClass();
        Class c3 =null;
        try {
            c3 = Class.forName("com.walle.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c1==c2);
        System.out.println(c1==c3);

        try {
            Foo foo1 = (Foo) c1.newInstance();
            foo1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class Foo{

    void  print(){
        System.out.println("ooo");
    }
}
