package com.cts.ecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmartConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartConfigServiceApplication.class, args);
	}

}
