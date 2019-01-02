package com.example.rabbiit.receive.rabbitReceive.receive;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangzeyu
 * @Date: 2019/1/2 15:57
 * @Description:
 */
@Component
public class HelloReceive {

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("================"+str);;
    }
}
