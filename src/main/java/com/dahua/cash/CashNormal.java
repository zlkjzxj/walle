package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.10:20
 * good good study!
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
