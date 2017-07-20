package com.everwing.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ***
 *
 * @author DELL shiny
 * @create 2017/7/20
 */
@RestController
public class FirstController {

    @GetMapping("first")
    public String first(@RequestParam String name){
        return "ni daye " +name;
    }

}
