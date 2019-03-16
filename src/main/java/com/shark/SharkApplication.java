package com.shark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.shark.mapper")
@SpringBootApplication
public class SharkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharkApplication.class, args);
    }

}
