package com.walle.quartzs;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/31.
 */
@Component("myTest")
public class TestJob {

    public void test(){
        System.out.println("test");
    }
}
