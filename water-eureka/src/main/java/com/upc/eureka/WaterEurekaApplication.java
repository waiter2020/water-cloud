package com.upc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author waiter
 */
@SpringBootApplication
@EnableEurekaServer
public class WaterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterEurekaApplication.class, args);
	}

}
