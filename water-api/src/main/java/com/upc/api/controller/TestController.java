package com.upc.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: waiter
 * @Date: 2019/9/1 14:27
 * @Version 1.0
 */
@RestController

public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
