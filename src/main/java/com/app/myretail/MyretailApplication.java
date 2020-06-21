package com.app.myretail;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackages = {"com.app.myretail.repository"})
public class MyretailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyretailApplication.class, args);
    }

}
