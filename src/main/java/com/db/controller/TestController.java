package com.db.controller;

import com.db.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/1/1.
 */
@Controller
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test1")
    public void testDyDB1(){
        testService.db1GetAll("dataSource1");
    }

    @RequestMapping("test2")
    public void testDyDB2(){
        testService.db2GetAll("dataSource2");
    }
}
