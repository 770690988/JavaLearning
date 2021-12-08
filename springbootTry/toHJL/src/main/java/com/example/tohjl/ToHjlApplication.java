package com.example.tohjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableCaching
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
@SpringBootApplication
public class ToHjlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToHjlApplication.class, args);
    }

}
