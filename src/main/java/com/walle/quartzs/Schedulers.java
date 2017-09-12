package com.walle.quartzs;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Schedulers {
    public static void main(String[] args) {
        try {
            //1.创建一个jobDetail实例，并且将该实例和Job绑定起来
            JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("myJob", "group1").build();
            //2.创建一个trigger实例，定义改job立即执行，并且没个两秒钟执行一次，直到永远。
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1").startNow().
                    withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();
            //3.创建一个schedule实例
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = null;

            scheduler = schedulerFactory.getScheduler();
            scheduler.start();
            scheduler.scheduleJob(jobDetail, trigger);
            System.out.println(scheduler.scheduleJob(jobDetail, trigger));

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
