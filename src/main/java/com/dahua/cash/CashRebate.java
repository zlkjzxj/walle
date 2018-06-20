package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.10:23
 * good good study!
 */
public class CashRebate extends CashSuper {
    private double cashRebate;

    public CashRebate(String cashRebate) {
        this.cashRebate = Double.parseDouble(cashRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*cashRebate;
    }
}
