package com.example.aggregator.service;

import com.example.aggregator.client.AggregatorRestClient;
import com.example.aggregator.model.AggregatorMessage;
import com.example.aggregator.model.Message;
import com.example.aggregator.model.MessageRequest;
import org.springframework.stereotype.Service;

@Service
public class AggregatorService {

    private AggregatorRestClient restClient;

    public AggregatorService(AggregatorRestClient restClient) {
        this.restClient = restClient;
    }

    public AggregatorMessage getMessage() {

        // Call Hello
        Message helloMessage = restClient.getHelloMessage();

        // Call World
        Message worldMessage = restClient.getWorldMessage();

        // Aggregate message and return
        StringBuilder builder = new StringBuilder();

        builder.append(helloMessage.getMessage());
        builder.append(" ");
        builder.append(worldMessage.getMessage());
        builder.append("!");

        String message = builder.toString();

        return new AggregatorMessage(message);

    }

    public AggregatorMessage getSpecificMessage(MessageRequest messageRequest) {

        String message = messageRequest.getTargetMessage().toLowerCase();
        AggregatorMessage aggregatorMessage;
        switch (message) {
            case "hello":
                aggregatorMessage = new AggregatorMessage(restClient.getHelloMessage());
                break;
            case "world":
                aggregatorMessage = new AggregatorMessage(restClient.getWorldMessage());
                break;
            default:
                aggregatorMessage = null;
        }
        return aggregatorMessage;
    }
}
