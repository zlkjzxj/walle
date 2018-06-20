package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.11:23
 * good good study!
 */
public class CashContext {
    CashSuper cashSuper = null;
    public CashContext(String type){
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            case "满300反一百":
                cashSuper = new CashReturn("300", "100");
                break;
        }
    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
