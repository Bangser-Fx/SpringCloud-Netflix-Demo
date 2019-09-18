package com.fx.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: SpringCloudNetflixTest->FeignService
 * @description: 远程调用服务
 * @author: Bangser
 * @create: 2019-09-17 21:01
 **/
@FeignClient(value = "springcloud-service",fallback = FeignHystrix.class)
public interface FeignService {
    /**
     * 远程调用服务端api
     * @param msg
     * @return
     */
    @GetMapping(value = "/{msg}")
    public String hello(@PathVariable("msg") String msg);
}
