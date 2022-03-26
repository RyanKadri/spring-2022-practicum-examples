package com.example.s3example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@SpringBootApplication
public class S3ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(S3ExampleApplication.class, args);
    }

    @Bean
    public S3Client s3Client() {
        Region region = Region.US_EAST_1;
        S3Client s3 = S3Client.builder().region(region).build();
        return s3;
    }
}
