package com.upgradd.messaging.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WhatsappService implements MessageService{
    @Override
    public void sentMessage(String msg) {
        System.out.println("Whatsapp is sending the message : "+msg);

    }
}
