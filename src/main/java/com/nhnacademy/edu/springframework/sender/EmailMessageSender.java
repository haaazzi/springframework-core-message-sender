package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class EmailMessageSender implements MessageSender {
    public EmailMessageSender() {
        System.out.println("EmailMessageSender initiated!");
    }

    public void init() {
        System.out.println("EmailMessageSender init called!!");
    }

    public void cleanup() {
        System.out.println("EmailMessageSender cleanup called!!");
    }

    public void sendMessage(User user, String message){
        System.out.println("EMAIL Message " + user.getEmail() + " : " + message);
    }
}
