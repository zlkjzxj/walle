package com.walle.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zlkjzxj on 2017/7/12.
 */
public class TestException {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        try{
            System.out.println("请输入第一个数");
            int one = scanner.nextInt();
            System.out.println("请输入第二个数");
            int two = scanner.nextInt();
            System.out.println("两书相处结果为："+one/two);
        }catch (InputMismatchException e){
            System.out.println("你应该输入整数");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("其他异常");
        }
        System.out.println("程序结束了");
    }
}
