package com.hdeujian.baomidou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.hdeujian.baomidou.mapper")
@SpringBootApplication
public class BaomidouLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaomidouLearnApplication.class, args);
    }

}
