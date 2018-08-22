package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 * @author yangfeng12345@139.com
 * @version [版本号, 2018/8/21 17:45]
 * 更新信息 [版本，更新功能，作者，更新日期]
 */

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    private String hello(){
        return "Hello World!";
    }
}