package com.everwing.server.service;

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

    public String firstService(String name){
        return restTemplate.getForObject("http://service-platform/first?name="+name,String.class);
    }
}
