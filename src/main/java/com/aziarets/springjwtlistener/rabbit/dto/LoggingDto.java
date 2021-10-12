package com.aziarets.springjwtlistener.rabbit.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoggingDto {
    private String user;
    private long loggingTime;
}
