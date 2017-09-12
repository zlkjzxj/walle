package com.walle.list;

import java.util.Comparator;

/**
 * Created by zlkjzxj on 2017/7/12.
 */
public class CompareorTest implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
