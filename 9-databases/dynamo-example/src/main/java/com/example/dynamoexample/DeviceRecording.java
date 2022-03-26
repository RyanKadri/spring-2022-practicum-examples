package com.example.dynamoexample;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondaryPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondarySortKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@DynamoDbBean
public class DeviceRecording {
    private String device_id;
    private String timestamp;
    private Double temperature;
    private Double humidity;

    public DeviceRecording(String device_id, String timestamp, Double temperature, Double humidity) {
        this.device_id = device_id;
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public DeviceRecording() {

    }

    @DynamoDbPartitionKey
    @DynamoDbSecondaryPartitionKey(indexNames = "deviceId-timestamp-index")
    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    @DynamoDbSortKey
    @DynamoDbSecondarySortKey(indexNames = "deviceId-timestamp-index")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

}


