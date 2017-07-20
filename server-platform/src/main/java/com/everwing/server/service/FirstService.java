package com.everwing.server.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 消费服务
 *
 * @author DELL shiny
 * @create 2017/7/20
 */
@Service
public class FirstService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String firstService(String name) {
        return restTemplate.getForObject("http://service-platform/first?name="+name,String.class);
    }

    public String error(String name){
        return "service error";
    }
}
