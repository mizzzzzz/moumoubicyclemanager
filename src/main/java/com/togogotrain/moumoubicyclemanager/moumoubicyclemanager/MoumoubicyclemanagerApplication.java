package com.togogotrain.moumoubicyclemanager.moumoubicyclemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.togogotrain.moumoubicyclemanager.moumoubicyclemanager.mappers")
public class MoumoubicyclemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoumoubicyclemanagerApplication.class, args);
    }
}
