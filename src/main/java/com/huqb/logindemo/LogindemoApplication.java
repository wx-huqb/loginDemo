package com.huqb.logindemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huqb.logindemo.mapper")
public class LogindemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogindemoApplication.class, args);
    }
}
