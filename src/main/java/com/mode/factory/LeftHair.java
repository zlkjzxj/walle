package com.mode.factory;

import com.walle.factory.HairInterface;

/**
 * Created by Administrator on 2017/7/5.
 */
public class LeftHair implements HairInterface {

    @Override
    public void draw() {
        System.out.println("--------实现了左偏分发型------------");
    }
}
