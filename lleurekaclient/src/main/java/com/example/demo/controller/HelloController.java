package com.example.demo.controller;

import com.example.demo.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亮 on 2018/3/22.
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloFeign;

    @RequestMapping(value = "/get/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return helloFeign.hello(name);
    }


}
