package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String sayHello(){
        String word= "springboot,welcome";
        System.out.println("springboot你好");
        return  word;
    }
}
