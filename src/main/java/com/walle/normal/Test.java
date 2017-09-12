package com.walle.normal;

/**
 * Created by walle on 2017/7/5.
 */
public class Test {
    public static void main(String[] args) {
//        Son son = new Son();
//        String fatherName = son.getFatherName();
//        son.address = "你大爷家";
        Father father = new Son();
        Son son = (Son) father;
        if(father instanceof Daughter){
            Daughter daughter = (Daughter) father;
        }else{
            System.out.println("son cannot be cast to daughter");
        }
    }
}
