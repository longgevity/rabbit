package com.example.rabbiit.receive.rabbitReceive.receive;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Auther: zhangzeyu
 * @Date: 2019/1/2 15:08
 * @Description:
 */
@Configuration
public class ReceiveConfig {

    @Bean
    public Queue queue(){
        return new Queue("queue");
    }
}
