package com.fx.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bangser
 */
@EnableEurekaClient

@SpringBootApplication
public class SpringcloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZipkinApplication.class, args);
    }

}
