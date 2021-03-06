package com.javamaster.controller;

import com.javamaster.model.MessageModel;
import com.javamaster.storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class MessageController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, MessageModel message) {
        System.out.println("Sending message: " + message + " to: " + to);
        boolean isExist = UserStorage.getInstance().getUsers().contains(to);

        if (isExist) {
            simpMessagingTemplate.convertAndSend("/topic/messages/" + to, message);
        }
    }
}
