package com.example.dynamoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@SpringBootApplication
public class DynamoExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamoExampleApplication.class, args);
    }

    @Bean
    public DynamoDbTable<DeviceRecording> buildTable() {
        DynamoDbClient client = DynamoDbClient.builder()
            .region(Region.US_EAST_1)
            .build();

        DynamoDbEnhancedClient enhancedClient = DynamoDbEnhancedClient.builder()
            .dynamoDbClient(client)
            .build();

        DynamoDbTable<DeviceRecording> table =
            enhancedClient.table("weather_readings", TableSchema.fromBean(DeviceRecording.class));

        return table;
    }

}
