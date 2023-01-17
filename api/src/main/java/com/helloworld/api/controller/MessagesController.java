package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessagesController {

    @GetMapping
    public String getMessages() {
        return "Olá Spring";
    }

}
