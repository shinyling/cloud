package com.everwing.zipkinclienthi.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

    private static final Logger logger= LogManager.getLogger(HiController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSample(){
        return new AlwaysSampler();
    }

    @GetMapping("hi")
    public String callHome(){
        logger.info("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:7073/miya",String.class);
    }

    @GetMapping("info")
    public String info(){
        logger.info("calling trace service-hi");
        return "i'm service hi";
    }
}
