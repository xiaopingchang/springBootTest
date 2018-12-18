package com.example.springboot.dao;

import org.springframework.stereotype.Component;

@Component
public class DaoDemo {

    public String testDemo(String str){
        String rtnAfterDosomething = "保存service层信息，返回dao处理结果";
        //这里是业务代码
        return rtnAfterDosomething;
    }
}
