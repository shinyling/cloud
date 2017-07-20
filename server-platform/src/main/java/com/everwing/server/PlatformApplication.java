package com.everwing.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlatformApplication {
	//restTemplate+ribbon消费服务
	public static void main(String[] args) {
		SpringApplication.run(PlatformApplication.class, args);
	}
}
