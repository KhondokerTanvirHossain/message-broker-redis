package com.tanvir.messagebrokerredis;

import org.springframework.stereotype.Component;

@Component
public interface MessagePublisher {
    void publish(String message);
}
