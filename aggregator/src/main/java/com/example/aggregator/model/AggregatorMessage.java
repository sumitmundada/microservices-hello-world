package com.example.aggregator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregatorMessage {

    private String message;

    // copy constructor
    public AggregatorMessage(Message message) {
        this.message = message.getMessage();
    }

}
