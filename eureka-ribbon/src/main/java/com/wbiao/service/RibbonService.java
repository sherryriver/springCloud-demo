package com.wbiao.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2016/8/26.
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    private String path = "http://COMPUTE-SERVICE/";

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity(path+"add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {

        return "error";
    }
}
