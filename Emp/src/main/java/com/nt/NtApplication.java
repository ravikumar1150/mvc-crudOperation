package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class NtApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtApplication.class, args);
    }

}
