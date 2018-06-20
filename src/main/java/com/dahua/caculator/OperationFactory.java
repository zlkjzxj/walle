package com.dahua.caculator;

/**
 * Created by walle
 * 2017/10/11.14:52
 * good good study!
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
