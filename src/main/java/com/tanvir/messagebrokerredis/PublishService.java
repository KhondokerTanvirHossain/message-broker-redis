package com.tanvir.messagebrokerredis;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PublishService {

    private final RedisMessagePublisher redisMessagePublisher;

    public PublishService(RedisMessagePublisher redisMessagePublisher) {
        this.redisMessagePublisher = redisMessagePublisher;
    }

    public void publishRandomMessage() {
        String message = "Message " + UUID.randomUUID();
        redisMessagePublisher.publish(message);
    }
}
