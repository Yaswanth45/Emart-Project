package com.cts.bas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BuyerActionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerActionServiceApplication.class, args);
	}

}
