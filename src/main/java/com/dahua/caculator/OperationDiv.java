package com.dahua.caculator;

/**
 * Created by walle
 * 2017/10/11.15:26
 * good good study!
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result =0;
        if(getNumberB()==0){
            throw new RuntimeException("除数不能为0");
        }
        result = getNumberA()/getNumberB();
        return result;
    }
}
