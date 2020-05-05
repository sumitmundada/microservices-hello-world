package com.example.world.controller;

import com.example.world.exception.InvalidUuidException;
import com.example.world.model.Message;
import com.example.world.service.WorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/world")
public class WorldController {

    private final WorldService worldService;

    public WorldController(WorldService worldService) {
        this.worldService = worldService;
    }

    @GetMapping("/getMessage")
    public Message getMessage() throws InvalidUuidException {
        return this.worldService.getMessage();
    }
}
