package com.example.rabbiit.receive.rabbitReceive;

import com.example.rabbiit.receive.rabbitReceive.receive.HelloReceive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: zhangzeyu
 * @Date: 2019/1/2 15:50
 * @Description:
 */
@SpringBootTest(classes = RabbitReceiveApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbit {

    @Autowired
    private HelloReceive helloReceive;

}
