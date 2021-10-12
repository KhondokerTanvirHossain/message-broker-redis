package com.tanvir.messagebrokerredis;

import org.springframework.stereotype.Service;

@Service
public class ReceiveMessage {
    
    public String subscribeMessage() {
        return RedisMessageSubscriber.messageList.get(0);
    }

}
