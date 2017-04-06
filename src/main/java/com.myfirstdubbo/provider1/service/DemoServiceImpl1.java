package com.myfirstdubbo.provider1.service;

import com.myfirstdubbo.DemoService;

/**
 * Created by yangyu on 16/11/17.
 */
public class DemoServiceImpl1 implements DemoService {
    public String sayHello(String name) {
        return "Dubbo:20881执行";
    }
}
