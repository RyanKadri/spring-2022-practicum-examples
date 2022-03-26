package com.example.s3example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class S3Controller {

    private final S3Client s3;

    S3Controller(S3Client s3) {
        this.s3 = s3;
    }

}
