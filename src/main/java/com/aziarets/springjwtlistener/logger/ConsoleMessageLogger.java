package com.aziarets.springjwtlistener.logger;

import com.aziarets.springjwtlistener.rabbit.dto.LoggingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ConsoleMessageLogger implements MessageLogger {

    @Override
    public void log(LoggingDto message) {
        String userEmail = message.getUser();
        Date loggingTime = new Date(message.getLoggingTime());
        System.out.println("User with email " + userEmail + " was logged at " + loggingTime);

    }
}
