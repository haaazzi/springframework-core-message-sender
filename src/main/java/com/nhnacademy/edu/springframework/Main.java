package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("haa.zzing@gmail.com", "010-0615-1004");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
//            System.out.println("---------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user, "배불러");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user, "배불러");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user, "졸려");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user, "졸려");
//            System.out.println("---------");
            MessageSendService service = context.getBean("messageSenderService", MessageSendService.class);
            service.doSendMessage(user, "집가고싶어");


        }
    }
}