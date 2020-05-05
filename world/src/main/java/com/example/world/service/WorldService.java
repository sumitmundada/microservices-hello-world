package com.example.world.service;


import com.example.world.exception.InvalidUuidException;
import com.example.world.model.Message;
import org.springframework.stereotype.Service;

@Service
public class WorldService {

    public Message getMessage() throws InvalidUuidException {

        Message newMessage = new Message("World");
        String uuid = newMessage.getId();
        if (uuid == null || uuid == "") {
            throw new InvalidUuidException();
        }
        return newMessage;
    }
}
