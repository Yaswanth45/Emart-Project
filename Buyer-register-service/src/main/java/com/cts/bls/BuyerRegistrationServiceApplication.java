package com.cts.bls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BuyerRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerRegistrationServiceApplication.class, args);
	}

}
