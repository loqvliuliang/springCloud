package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亮 on 2018/3/22.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}