package com.ken.mybatistest1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("/com.ken.mybatistest1.mapper")
@SpringBootApplication
public class Mybatistest1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatistest1Application.class, args);
    }

}
