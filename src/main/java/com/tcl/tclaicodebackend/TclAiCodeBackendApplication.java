package com.tcl.tclaicodebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.tcl.tclaicodebackend.mapper")
public class TclAiCodeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TclAiCodeBackendApplication.class, args);
    }

}
