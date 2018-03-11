package com.abhinendra;

import com.abhinendra.services.CompanyDetailLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.convert.Jsr310Converters;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EntityScan(basePackages = {"com.abhinendra.domain"})
@ComponentScan(basePackages = "com.abhinendra")
public class ServerApplication {
    @Autowired
    CompanyDetailLoader companyDetailLoader;

    @PostConstruct
    public void loadDetails() {
        companyDetailLoader.loadDetails("HGINFRA");

    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);

    }
}
