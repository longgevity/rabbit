package com.example.rabbiit.send.rabbitSend.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangzeyu
 * @Date: 2019/1/2 15:45
 * @Description:
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void set(String queue,String message) {
        amqpTemplate.convertAndSend(queue,message);
    }
}
