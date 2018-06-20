package com.dahua.caculator;

import java.util.Scanner;

/**
 * Created by walle
 * 2017/10/11.15:00
 * good good study!
 */
public class Caculator {
    public static void main(String[] args) {
        Operation operation;
        Scanner scanner = new Scanner(System.in);
        String operate = scanner.next();
        System.out.println("您输入的运算符是："+operate);
        operation = OperationFactory.createOperate(operate);
        Double numberA = scanner.nextDouble();
        System.out.println("您输入的第一个数字是："+numberA);
        Double numberB = scanner.nextDouble();
        System.out.println("您输入的第二个数字是："+numberB);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        double result = operation.getResult();
        System.out.println("输出结果是:"+result);
    }
}
