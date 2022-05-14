package com.upgradd.messaging.service.Controller;

import com.upgradd.messaging.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(@Qualifier("whatsappService")MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message)
    {
        this.messageService.sentMessage(message);
    }
}
