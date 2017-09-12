package com.walle.reflect;

/**
 * Created by Administrator on 2017/8/1.
 */
//可变参数学习，哈哈哈哈哈
public class CanChangepara {

    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5, 6);
        sum(new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void sum(int... ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            sum += ints[i];
        }
        System.out.println("\nsum=" + sum);
    }
}
