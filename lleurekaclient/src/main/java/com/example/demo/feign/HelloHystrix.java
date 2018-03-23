package com.example.demo.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 刘亮 on 2018/3/22.
 */
@Component
public class HelloHystrix  implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name){
        return "hello" +name+", this messge send failed ";
    }
}
