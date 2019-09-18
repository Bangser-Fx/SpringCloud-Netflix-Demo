package com.fx.springcloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudNetflixTest->FirstController
 * @description:
 * @author: bangser
 * @create: 2019-09-17 20:41
 **/
@RestController
public class FirstController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = {"/{msg}","/hello/{msg}"})
    public String hello(@PathVariable("msg") String msg){
        return String.format("服务提供者返回消息：%s,端口：%s",msg,port);
    }
}
