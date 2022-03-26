package com.example.s3example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NoteController {

    private final S3Client s3;

    NoteController(S3Client s3) {
        this.s3 = s3;
    }

    @PostMapping("/notes")
    public String uploadNote(@RequestBody NoteDetails details) {

        var request = PutObjectRequest.builder().bucket("my-pocket").key(details.title()).build();
        s3.putObject(request, software.amazon.awssdk.core.sync.RequestBody.fromString(details.body()));

        return "Success";
    }

    @GetMapping("/notes")
    public List<String> listBuckets() {
        var listRequest = ListObjectsRequest.builder().bucket("my-pocket").build();
        var objects = this.s3.listObjects(listRequest).contents();
        List<String> names = new ArrayList<>();
        for(S3Object obj: objects) {
            names.add(obj.key());
        }
        return names;
    }

}
