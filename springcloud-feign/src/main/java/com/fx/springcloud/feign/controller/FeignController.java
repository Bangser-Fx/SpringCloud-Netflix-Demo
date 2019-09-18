package com.fx.springcloud.feign.controller;

import com.fx.springcloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



/**
 * @program: SpringCloudNetflixTest->FeignController
 * @description:
 * @author: Bangser
 * @create: 2019-09-17 21:05
 **/
@RestController
public class FeignController {


    @Autowired
    private FeignService feignService;

    @GetMapping("/{msg}")
    public String feign(@PathVariable("msg") String msg){
        String hello = feignService.hello(msg);
        return String.format("远程调用服务。结果-> %s",hello);
    }
}
