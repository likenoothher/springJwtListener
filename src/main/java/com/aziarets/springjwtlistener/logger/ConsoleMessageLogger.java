package com.aziarets.springjwtlistener.logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ConsoleMessageLogger implements MessageLogger {

    private final ObjectMapper objectMapper;

    @Override
    public void log(Message message) {
        try {
            ObjectNode node = objectMapper.readValue(message.getBody(), ObjectNode.class);
            String userEmail = node.get("user").textValue();
            Date loggingTime = new Date(node.get("loggingTime").asLong());
            System.out.println("User with email " + userEmail + " was logged at " + loggingTime);
        } catch (Exception e) {
            System.out.println("Can't parse user logging details message: " + e.getMessage());
        }
    }
}
