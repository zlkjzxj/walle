package com.walle.statics;

/**
 * Created by zlkjzxj on 2017/7/10.
 * 1.��Ա��������Ҫ��ʼ�����ֲ�����Ҫ��ʼ��
 * 2.���÷�Χ��ͬ
 * 2.�ֲ�������������
 * 3.�����������ʱ���ֲ������ȼ�
 */
public class Test {

    //����һ����Ա��������Ա��������Ҫ��ʼ��
    int var;

    void test(){
        int localVar = 0;//�ֲ������������ʼֵ������ʹ�ûᱨ��
        int var = 40;
        System.out.println("var:"+var);
        System.out.println("localVar:"+localVar);
    }

    public static void main(String[] args) {
        new Test().test();
    }
}
