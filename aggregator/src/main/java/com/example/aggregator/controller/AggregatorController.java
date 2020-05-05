package com.example.aggregator.controller;

import com.example.aggregator.model.AggregatorMessage;
import com.example.aggregator.model.MessageRequest;
import com.example.aggregator.service.AggregatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AggregatorController {

    AggregatorService service;

    public AggregatorController(AggregatorService service) {
        this.service = service;
    }

    @GetMapping("/getMessage")
    public AggregatorMessage getMessage() {
        return service.getMessage();
    }

    @GetMapping("/getSpecificMessage")
    public AggregatorMessage getSpecificMessage(@RequestBody @Valid MessageRequest messageRequest) {
        return service.getSpecificMessage(messageRequest);
    }
}
