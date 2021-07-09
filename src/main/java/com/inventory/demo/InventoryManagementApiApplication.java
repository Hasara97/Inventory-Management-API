package com.inventory.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InventoryManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryManagementApiApplication.class, args);
    }

}
