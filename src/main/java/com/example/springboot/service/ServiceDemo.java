package com.example.springboot.service;

import com.example.springboot.dao.DaoDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceDemo {

    @Autowired
    DaoDemo daoDemo;

    public String testDemo(){
        String rtnAfterDosomething = "我是返回结果service";
        String daoResult = daoDemo.testDemo(rtnAfterDosomething);
        //这里是业务代码
        return daoResult;
    }
}
