package com.sa.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class UserApplication {
	
	@Autowired
    private EurekaClient discoveryClient; 

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("STORES", false);
        return instance.getHomePageUrl();
}
}
