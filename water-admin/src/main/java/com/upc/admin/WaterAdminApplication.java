package com.upc.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author waiter
 */
@SpringBootApplication
@EnableAdminServer
public class WaterAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterAdminApplication.class, args);
    }

}
