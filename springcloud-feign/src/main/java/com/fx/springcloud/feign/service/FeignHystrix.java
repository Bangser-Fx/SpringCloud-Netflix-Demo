package com.fx.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * @program: SpringCloudNetflixTest->FeignHystrix
 * @description: 熔断器回调类
 * @author: Bangser
 * @create: 2019-09-17 21:59
 **/
@Component
public class FeignHystrix implements FeignService {

    @Override
    public String hello(String msg) {
        return String.format("远程调用失败，源消息：%s",msg);
    }
}
