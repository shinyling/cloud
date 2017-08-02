package com.everwing.zipkinclientmiya.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MiyaController {

    private static final Logger logger= LogManager.getLogger(MiyaController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("hi")
    public String home(){
        logger.info("hi is being called");
        return "hi i'm miya";
    }

    @GetMapping("miya")
    public String info(){
        logger.info("info is being called");
        return restTemplate.getForObject("http://localhost:7072/info",String.class);
    }
}
