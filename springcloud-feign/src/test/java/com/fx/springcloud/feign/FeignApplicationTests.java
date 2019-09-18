package com.fx.springcloud.feign;

import com.fx.springcloud.feign.service.FeignService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignApplicationTests {

    @Autowired
    private FeignService feignService;

    @Test
    public void contextLoads() {
        String hello = feignService.hello("你好！");
        System.out.println(hello);
    }

}
