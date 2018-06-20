package com.dahua.caculator;

/**
 * Created by walle
 * 2017/10/11.15:23
 * good good study!
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA()-getNumberB();
        return result;
    }
}
