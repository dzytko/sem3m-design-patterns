package com.example.sem3mdesignpatternsv2.utils.logging;

import java.util.Set;

// Odwracanie zależności
public class LoggerChain extends BaseLogger
{
    private final Set<BaseLogger> loggers;

    public LoggerChain(Set<BaseLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    protected void log(String message) {
        loggers.forEach(logger -> logger.log(message));
    }
}
