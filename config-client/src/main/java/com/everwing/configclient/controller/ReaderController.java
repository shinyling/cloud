package com.everwing.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ReaderController {

    @Value("${address}")
    private String address;

    @GetMapping(value = "address")
    public String read(){
        return address;
    }
}
