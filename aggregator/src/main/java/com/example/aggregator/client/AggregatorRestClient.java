package com.example.aggregator.client;

import com.example.aggregator.model.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AggregatorRestClient {

    private RestTemplate restTemplate;

    public AggregatorRestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Message getHelloMessage() {

        final String uri = "http://localhost:9091/hello/getMessage";

        Message result = restTemplate.getForObject(uri, Message.class);

        return result;
    }

    public Message getWorldMessage() {

        final String uri = "http://localhost:9092/world/getMessage";

        Message result = restTemplate.getForObject(uri, Message.class);

        return result;
    }
}
