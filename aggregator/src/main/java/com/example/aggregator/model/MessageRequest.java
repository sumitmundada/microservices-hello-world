package com.example.aggregator.model;

import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class MessageRequest {

    @Pattern(regexp = "^hello$|^world$")
    private String targetMessage;
}
