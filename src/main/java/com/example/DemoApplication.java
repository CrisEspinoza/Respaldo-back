package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan({"com.example.demo", "com.example.Controllers"})
@EntityScan("com.example.Entities")
@EnableJpaRepositories("com.example.Repositories")
public class DemoApplication   extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}
