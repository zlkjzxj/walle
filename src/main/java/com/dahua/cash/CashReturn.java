package com.dahua.cash;

/**
 * Created by walle
 * 2017/10/12.10:29
 * good good study!
 * 返利收费子类  例如满三百反一百
 */
public class CashReturn extends CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money>=moneyCondition){
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return 0;
    }


    public static void main(String[] args) {
        double result = 340-Math.floor(340/300)*100;
        System.out.println(Math.floor(340/300));
        //floor 返回不大于的最大整数 round 四舍五入 ceil返回大于的最大整数
        System.out.println(result);

    }
}
