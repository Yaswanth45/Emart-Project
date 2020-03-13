package com.cts.eps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmartPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartPaymentServiceApplication.class, args);
	}

}
