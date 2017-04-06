package com.myfirstdubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangyu on 16/11/17.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/provider.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
