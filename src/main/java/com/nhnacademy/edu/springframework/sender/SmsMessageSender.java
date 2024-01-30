package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;

public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("SmsMessageSender initiated!");
    }

    public void init() {
        System.out.println("SmsMessageSender init called!!");
    }

    public void cleanup() {
        System.out.println("SmsMessageSender cleanup called!!");
    }

    public void sendMessage(User user, String message){
        System.out.println("SMS Message " + user.getPhoneNumber() + " : " + message);
    }
}
