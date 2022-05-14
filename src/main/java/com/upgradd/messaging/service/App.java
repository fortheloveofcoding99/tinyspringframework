package com.upgradd.messaging.service;

import com.upgradd.messaging.service.Controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.upgradd.messaging");

        MessageController messageController = (MessageController) context.getBean("messageController");

        messageController.sendMessage("Tiny Spring Framework");
    }
}
