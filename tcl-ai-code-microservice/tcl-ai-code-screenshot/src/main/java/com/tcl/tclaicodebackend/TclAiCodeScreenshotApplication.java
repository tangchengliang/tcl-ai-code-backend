package com.tcl.tclaicodebackend;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TclAiCodeScreenshotApplication {
    public static void main(String[] args) {
        SpringApplication.run(TclAiCodeScreenshotApplication.class, args);
    }
}
