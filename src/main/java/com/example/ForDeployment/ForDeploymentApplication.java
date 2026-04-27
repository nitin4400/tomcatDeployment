package com.example.ForDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ForDeploymentApplication extends SpringBootServletInitializer { // 1. Extend this class

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { // 2. Add this method
        return builder.sources(ForDeploymentApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ForDeploymentApplication.class, args);
    }
}
