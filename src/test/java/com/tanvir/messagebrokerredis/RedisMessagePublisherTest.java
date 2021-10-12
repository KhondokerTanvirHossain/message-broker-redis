package com.tanvir.messagebrokerredis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class RedisMessagePublisherTest {

    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @Test
    public void redisMessagePublisherSuccessTest() throws InterruptedException {
        redisMessagePublisher.publish("REDIS" + UUID.randomUUID());
        Thread.sleep(10000);
        Assertions.assertThat(RedisMessageSubscriber.messageList.get(0)).contains("REDIS");
        Thread.sleep(10000);
        System.out.println(RedisMessageSubscriber.messageList.get(0));
    }
}
