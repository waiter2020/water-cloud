package com.upc.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author waiter
 */
@SpringBootApplication
public class WaterBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterBaseApplication.class, args);
    }

}
