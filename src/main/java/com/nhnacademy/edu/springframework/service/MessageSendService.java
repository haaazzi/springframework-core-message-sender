package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.domain.User;

public class MessageSendService{
    private MessageSender messageSender;

    public MessageSendService() {

    }

    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("hello");
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }
}
