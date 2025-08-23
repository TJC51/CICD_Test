package com.example.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TJC
 * @version 1.0.0
 * @description TODO
 * @date 2025/8/23 14:09:06
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test01", method = RequestMethod.GET)
    public String test01(){
        log.info("CI/CD测试");
        return "CI/CD测试";
    }
}
