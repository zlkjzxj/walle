package com.walle.statics;

/**
 * static
 *
 * Created by zlkjzxj on 2017/7/10.
 *
 *
 * java static
 * static 声明的变量在类加载（编译）的时候就由系统分配出类存一直存放，程序运行就一直存在,程序结束后才会释放。
 * 而非static的对象每次使用都要new一下。 static 就不用，直接类名点就能调用 ，eg Integer.parseInt() ,Float.parseFloat()
 * 这样的变量和方法我们又叫做类变量和方法。
 */
public class Test1 {

    public static int a = 1;
    public int b =2;

    public static void test(){
        System.out.println(Test1.a);//静态方法可以直接调用类的静态变量
        System.out.println(new Test1().b);//调用成员变量就要new

    }


    //测试下
    static int i ;
    public Test1(){
        i=4;
    }
    public Test1(int j ){
        i=j;
    }
    //结果3个4
    public static void main(String[] args) {
        Test1 test = new Test1(5);
        Test1 test1 = new Test1();
        System.out.println(test.i);
        System.out.println(test1.i);
        System.out.println(test.i);
        System.out.println(new Test1().b);
    }

    void fuck(){
        System.out.println(i+b);
    }

    static{
        int cc = 0;
        String a = "111";
        System.out.println("我是静态块，我很叼的");
    }
}
