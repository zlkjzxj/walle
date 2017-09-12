package com.dom.test;

/**
 * Created by zlkjzxj on 2017/7/18.
 */
public class 女朋友 {
    private int 年龄;
    private int 身高;
    private String 学历;
    private double 收入;
    private float d;

    public 女朋友() {
    }

    public 女朋友(int 年龄, int 身高, String 学历, double 收入, float d) {
        this.年龄 = 年龄;
        this.身高 = 身高;
        this.学历 = 学历;
        this.收入 = 收入;
        this.d = d;
    }

    @Override
    public String toString() {
        return "我创建了一个女朋友{" +
                "年龄=" + 年龄 +
                "岁, 身高=" + 身高 +
                "cm, 学历='" + 学历 + '\'' +
                ", 收入=" + 收入 +
                ", d=" + d +
                '}';
    }

    public static void main(String[] args) {
        女朋友 女朋友 = new 女朋友(25,168,"大专",8888d,62f);
        System.out.println(女朋友.toString());
    }
}
