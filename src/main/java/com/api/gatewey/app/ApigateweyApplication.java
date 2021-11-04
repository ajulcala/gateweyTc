package com.api.gatewey.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApigateweyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigateweyApplication.class, args);
	}

}
