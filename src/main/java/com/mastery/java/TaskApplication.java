package com.mastery.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class TaskApplication {
    private static final Logger logger = LoggerFactory.getLogger(TaskApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        logger.info("Application started");
    }

}



