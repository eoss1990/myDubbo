package com.myfirstdubbo.provider1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangyu on 16/11/17.
 */
public class Provider1 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/provider1.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
