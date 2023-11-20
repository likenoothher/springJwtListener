package com.aziarets.springjwtlistener.logger;

import com.aziarets.springjwtlistener.rabbit.dto.LoggingDto;

public interface MessageLogger {
    void log(LoggingDto message);
}
