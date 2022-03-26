package com.example.dynamoexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.model.Page;
import software.amazon.awssdk.enhanced.dynamodb.model.QueryConditional;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceController {

    private final DynamoDbTable<DeviceRecording> recordingTable;

    DeviceController(DynamoDbTable<DeviceRecording> recordingTable) {
        this.recordingTable = recordingTable;
    }

    @PostMapping("/recordings")
    public String uploadRecording(@RequestBody DeviceRecording recording) {
        this.recordingTable.putItem(recording);
        return "Success";
    }

    @GetMapping("/recordings/{deviceId}/{timestamp}")
    public DeviceRecording getRecording(@PathVariable String deviceId, @PathVariable String timestamp) {
        return this.recordingTable.getItem(Key.builder().partitionValue(deviceId).sortValue(timestamp).build());
    }

    @GetMapping("/recordings/{deviceId}")
    public List<DeviceRecording> getRecordings(
        @PathVariable String deviceId,
        @RequestParam String startTime,
        @RequestParam String endTime
    ) {
        QueryConditional query = QueryConditional
            .sortBetween(
                Key.builder().partitionValue(deviceId).sortValue(startTime).build(),
                Key.builder().partitionValue(deviceId).sortValue(endTime).build()
            );

        var iterable = recordingTable.index("deviceId-timestamp-index")
            .query(query);
        List<DeviceRecording> recordings = new ArrayList<>();
        for(Page<DeviceRecording> user: iterable) {
            recordings.addAll(user.items());
        }

        return recordings;
    }

}
