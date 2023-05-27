package edu.shily.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Shily-zhang
 * @Description
 */@SpringBootApplication
@EnableEurekaClient

public class MainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class,args);
    }
}
