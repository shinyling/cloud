package com.everwing.server.hystrix;

import com.everwing.server.service.FirstService;
import org.springframework.stereotype.Component;

/**
 * 增加断路器
 *
 * @author DELL shiny
 * @create 2017/7/20
 */
@Component
public class FirstServiceHystrix implements FirstService{

    @Override
    public String first(String name) {
        return "service error";
    }
}
