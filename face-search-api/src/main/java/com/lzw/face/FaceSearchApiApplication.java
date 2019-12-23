package com.lzw.face;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author James
 */
@SpringBootApplication
@MapperScan(value = "com.lzw.face.mapper")
public class FaceSearchApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceSearchApiApplication.class, args);
    }

}
