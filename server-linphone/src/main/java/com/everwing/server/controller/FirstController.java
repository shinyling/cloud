package com.everwing.server.controller;

import com.everwing.server.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * feign消费服务
 *
 * @author DELL shiny
 * @create 2017/7/20
 */
@RestController
public class FirstController {

    @Autowired
    FirstService firstService;

    @RequestMapping(value = "first",method = RequestMethod.GET)
    public String first(@RequestParam String name){
        return firstService.first(name);
    }
}
