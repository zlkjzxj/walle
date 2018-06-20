package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.10:46
 * good good study!
 * 收费工厂类
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
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
        return cashSuper;
    }
}
