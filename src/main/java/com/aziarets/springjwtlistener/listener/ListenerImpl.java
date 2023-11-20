package com.aziarets.springjwtlistener.listener;

import com.aziarets.springjwtlistener.logger.MessageLogger;
import com.aziarets.springjwtlistener.rabbit.dto.LoggingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListenerImpl {

    private final MessageLogger messageLogger;

    @RabbitListener(queues = "springJwtLoggingQueue", messageConverter = "converter")
    public void onMessage(LoggingDto message) {
        messageLogger.log(message);
    }
}
