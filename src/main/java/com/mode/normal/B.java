package com.mode.normal;

/**
 * Created by walle on 2017/7/5.
 */
class B extends com.walle.normal.A {
    B() {
        print("B()");
    }

    public void f() {
        print("B:f()");
    }

    public static void main(String arg[]) {
        com.walle.normal.B b = new com.walle.normal.B();
        b.f();
    }
}
