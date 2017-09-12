package com.walle.reflect;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Office {
    public static void main(String[] args) {
        try {
            for (String s:args){
                System.out.println(s);
            }
            //动态加载类，一种思想，不用改代码，只需要重新定于一个雷实现OfficeAble接口即可
            //主要用于区分编译时加载类和运行时加载类。
            Class c = Class.forName(args[0]);
            OfficeAble a = (OfficeAble) c.newInstance();
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
