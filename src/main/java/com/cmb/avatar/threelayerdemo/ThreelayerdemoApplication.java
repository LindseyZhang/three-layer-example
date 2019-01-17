package com.cmb.avatar.threelayerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cmb.avatar.threelayerdemo.repository")
public class ThreelayerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreelayerdemoApplication.class, args);
    }

}

