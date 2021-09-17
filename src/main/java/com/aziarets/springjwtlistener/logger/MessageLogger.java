package com.aziarets.springjwtlistener.logger;

import org.springframework.amqp.core.Message;

public interface MessageLogger {
    void log(Message message);
}
