package com.everwing.server.service;

import com.everwing.server.hystrix.FirstServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by DELL on 2017/7/20.
 */
@FeignClient(value = "service-platform",fallback = FirstServiceHystrix.class)
public interface FirstService {

    @RequestMapping(value = "/first",method = RequestMethod.GET)
    String first(@RequestParam("name") String name);
}
