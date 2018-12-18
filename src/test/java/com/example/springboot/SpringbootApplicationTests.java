package com.example.springboot;

import com.example.springboot.dao.DaoDemo;
import com.example.springboot.service.ServiceDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    ServiceDemo serviceDemo;

    @Autowired
    DaoDemo daoDemo;

    @Test
    public void testDemo() {
        String rtn = serviceDemo.testDemo();
        String daoRe =daoDemo.testDemo(rtn);
        System.out.println(rtn+ daoRe);
    }

}
