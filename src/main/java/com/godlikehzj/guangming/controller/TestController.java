package com.godlikehzj.guangming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zhijunhu on 2016/10/27.
 */
@Controller

public class TestController {
    @RequestMapping(value = "v1.do")
    public void test(){
        AtomicLong a = new AtomicLong(1);
        Long b = 1L;
        System.out.println("test");
    }
}
