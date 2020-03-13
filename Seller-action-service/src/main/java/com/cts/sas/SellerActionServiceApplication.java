package com.cts.sas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SellerActionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerActionServiceApplication.class, args);
	}

}
