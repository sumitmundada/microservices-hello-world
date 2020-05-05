package com.example.hello.service;

import com.example.hello.exception.InvalidUuidException;
import com.example.hello.model.Message;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Message getMessage() throws InvalidUuidException {

        Message newMessage = new Message("Hello");
        String uuid = newMessage.getId();
        if (uuid == null || uuid == "") {
            throw new InvalidUuidException();
        }
        return newMessage;
    }
}
