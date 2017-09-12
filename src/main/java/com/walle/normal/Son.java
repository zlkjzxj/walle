package com.walle.normal;

/**
 * Created by walle on 2017/7/5.
 */
public class Son extends Father {

    private String height;
    private String weight;

    public String getSonHeight(){
        return "150kg";
    }

    //方法的重写，继承父类；方法名、参数、返回类型都相同；不能使用更严格的访问权限。
     public int getFatherAge(int age){
        return 100;
    }

}
