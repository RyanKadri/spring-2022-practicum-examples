package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.util.List;

@RestController
public class NotesController {

    private List<String> notes;

    @GetMapping("/notes")
    public String createNote(@RequestParam String fileName, @RequestParam String body) {
        S3Client client = S3Client.builder()
            .region(Region.US_EAST_1)
            .build();

        PutObjectRequest request = PutObjectRequest.builder()
            .bucket("my-pocket")
            .key(fileName)
            .build();

        var requestBody = RequestBody.fromString(body);

        client.putObject(request, requestBody);

        return "Success";
    }
}
