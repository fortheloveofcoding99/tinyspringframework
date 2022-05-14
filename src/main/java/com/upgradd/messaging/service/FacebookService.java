package com.upgradd.messaging.service;

import org.springframework.stereotype.Component;

@Component
public class FacebookService implements MessageService{
    @Override
    public void sentMessage(String msg) {
        System.out.println("Facebook is sending the message "+msg);
    }
}
