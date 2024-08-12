package com.sangita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaClientEmployeeData2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientEmployeeData2Application.class, args);
	}

}
