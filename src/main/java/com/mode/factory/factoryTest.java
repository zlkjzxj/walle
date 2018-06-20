package com.mode.factory;

import com.walle.factory.HairFactory;
import com.walle.factory.HairInterface;

/**
 * Created by Administrator on 2017/7/5.
 */
public class factoryTest {

    public static void main(String[] args) {
        //直接掉接口不方便
//        HairInterface left = new LeftHair();
//        left.draw();

        //调用发型工厂
//        HairFactory factory = new HairFactory();
//        HairInterface leftHair = factory.getHair("left");
//        leftHair.draw();

        //反射机制按类名调用
//        HairFactory factory = new HairFactory();
//        HairInterface leftHair = factory.getHairByClass("com.walle.factory.LeftHair");//必须全类名，不然找不到
//        leftHair.draw();
        //properties文件调用】
        HairFactory hairFactory = new HairFactory();
        HairInterface hairInterface = hairFactory.getHairByProperties("left");
        hairInterface.draw();
    }
}
