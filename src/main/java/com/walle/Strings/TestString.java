package com.walle.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zlkjzxj on 2017/7/12.
 */
public class TestString {


    public static void main(String[] args) throws ParseException {
        /**
        String a = "fuck";
        String b = "fuck";
        String c = new String("fuck");
        String d = new String("fuck");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));


        //基本类型转换为字符串
        int c= 10;
        String s1 = String.valueOf(c);
        String s2 = Integer.toString(c);
        String s3 = c+"";

        System.out.println(s1+s2+s3);

        //字符串转换为基本类型
        String s = "10";
        int d = Integer.parseInt(s);
        int e = Integer.valueOf(s);
        System.out.println(d+e);


        Date date = new Date();
        System.out.println(date);//China Standard Time 中国标准时间
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String _date = sf.format(date);
        System.out.println(_date);

        String d = "2017-1-1 12:65:32";
        Date dd = sf.parse(d);
        System.out.println(dd);
         */

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Date  date = calendar.getTime();

        Math.round(1.1);


    }
}
