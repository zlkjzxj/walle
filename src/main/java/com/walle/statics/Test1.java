package com.walle.statics;

/**
 * static
 *
 * Created by zlkjzxj on 2017/7/10.
 *
 *
 * java static
 * static �����ı���������أ����룩��ʱ�����ϵͳ��������һֱ��ţ��������о�һֱ����,���������Ż��ͷš�
 * ����static�Ķ���ÿ��ʹ�ö�Ҫnewһ�¡� static �Ͳ��ã�ֱ����������ܵ��� ��eg Integer.parseInt() ,Float.parseFloat()
 * �����ı����ͷ��������ֽ���������ͷ�����
 */
public class Test1 {

    public static int a = 1;
    public int b =2;

    public static void test(){
        System.out.println(Test1.a);//��̬��������ֱ�ӵ�����ľ�̬����
        System.out.println(new Test1().b);//���ó�Ա������Ҫnew

    }


    //������
    static int i ;
    public Test1(){
        i=4;
    }
    public Test1(int j ){
        i=j;
    }
    //���3��4
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
        System.out.println("���Ǿ�̬�飬�Һܵ��");
    }
}
