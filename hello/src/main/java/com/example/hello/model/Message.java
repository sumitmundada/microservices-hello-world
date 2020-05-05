package com.example.hello.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Message {

    String id;
    String message;

    public Message(String message) {
        this.id = UUID.randomUUID().toString();
        this.message = message;
    }
}
