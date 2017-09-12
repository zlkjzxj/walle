package com.walle.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/1.
 */
public class listType {
    //集合泛型是编译时的，运行时没有泛型
    //反射的操作都是编译之后的操作
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");
//        list.add(20);//报错
        Class c = list.getClass();
        Class c1 = list1.getClass();
        System.out.println(c == c1);//true 说明编译之后集合的泛型是去泛型话的，没有泛型了
        //java中集合的泛型是防止错误输入的，只在编译阶段有效，编译完之后就无效了
        //验证：通过方法的反射绕过编译

        try {
            Method m = c1.getMethod("add", Object.class);
            try {
                m.invoke(list1, 100);
                System.out.println(list1);
                //循环会报错
//                for (int i = 0; i <list1.size() ; i++) {
//                    System.out.println(list1.get(i)+"");
//                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
