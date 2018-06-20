package com.mode.normal;

import com.walle.normal.Son;

/**
 * Created by walle on 2017/7/5.
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        String fatherName = son.getFatherName();
        son.address = "你大爷家";
    }
}
