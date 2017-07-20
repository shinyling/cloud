package com.everwing.server.controller;

import com.everwing.server.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费服务
 *
 * @author DELL shiny
 * @create 2017/7/20
 */
@RestController
public class TestFirstController {

    @Autowired
    FirstService firstService;

    @GetMapping("first")
    public String first(@RequestParam String name){
        return firstService.firstService(name);
    }
}
