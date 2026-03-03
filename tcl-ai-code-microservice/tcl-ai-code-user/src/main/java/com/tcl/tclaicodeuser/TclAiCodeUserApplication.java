package com.tcl.tclaicodeuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.tcl.tclaicodeuser.mapper")
@ComponentScan("com.tcl")
//@EnableDubbo
public class TclAiCodeUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TclAiCodeUserApplication.class, args);
    }
}
