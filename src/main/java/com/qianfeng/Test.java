package com.qianfeng;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //完成spring.xml配置文件的解析和spring容器的初始化
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        MaLeader leader = applicationContext.getBean(MaLeader.class);
//        System.out.println(leader.getWater().getName());
        //此处的maLeader要与配置文件里的bean id 一致
        MaLeader leader = (MaLeader) applicationContext.getBean("maLeader");
        System.out.println(leader.getWater().getName());
    }
}
