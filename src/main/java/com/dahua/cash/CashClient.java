package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.10:53
 * good good study!
 * 收费客户端
 */


/**
 * 策略模式和工厂模式的区别在于
 * 简单工厂模式要识别两个类CashSuper和CashFactory
 * 而策略模式只需要识别一个CashContext就行 ，耦合更低
 * 让具体的算法和客户端分离。
 *
 * 策略模式减少了各种算法类和使用算法之间的耦合，把他们的公共的功能写到一个getResult方法
 * 使得算法间有了公共的父类CashSuper
 */
public class CashClient {

    public static void main(String args[]) {
        double total = 0.00d;
        //此处type可以根据下拉框来选择
//        CashSuper cashSuper = CashFactory.createCashAccept("打8折");
//        double totalPrices = cashSuper.acceptCash(200);
//        total = total + totalPrices;
//        System.out.println(total);
        CashContext cashContext = new CashContext("打8折");
        double totalPrices = cashContext.getResult(2 * 300);
        total = total + totalPrices;
        System.out.println(total);
    }
}
