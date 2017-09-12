package com.walle.normal;

/**
 * Created by walle on 2017/7/5.
 */
class A {
    protected void print(String s) {
        System.out.println(s);
    }

    A() {
        print("A()");
    }

    public void f() {
        print("A:f()");
    }
}
