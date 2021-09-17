package com.aziarets.springjwtlistener.listener;

import com.aziarets.springjwtlistener.logger.MessageLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListenerImpl implements MessageListener {

    private final MessageLogger messageLogger;

    @Override
    @RabbitListener(queues = "${rabbit.queue-name}")
    public void onMessage(Message message) {
        messageLogger.log(message);
    }
}
