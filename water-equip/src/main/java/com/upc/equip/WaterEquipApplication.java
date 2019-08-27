package com.upc.equip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author waiter
 */
@SpringBootApplication
@EnableEurekaClient
public class WaterEquipApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterEquipApplication.class, args);
    }

}
