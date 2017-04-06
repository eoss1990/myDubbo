package com.myfirstdubbo.provider.service;

import com.myfirstdubbo.DemoService;

/**
 * Created by yangyu on 16/11/17.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Dubbo:20880执行";
    }
}
