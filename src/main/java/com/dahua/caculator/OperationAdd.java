package com.dahua.caculator;

/**
 * Created by walle
 * 2017/10/11.14:50
 * good good study!
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA()+getNumberB();
        return result;
    }
}
