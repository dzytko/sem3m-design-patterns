package com.example.sem3mdesignpatternsv2.utils.logging;

import java.util.Set;

public class LoggerChain extends BaseLogger
{
    private final Set<BaseLogger> loggers;

    public LoggerChain(Set<BaseLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    protected void log(String message) {
        for (BaseLogger logger : loggers) {
            logger.log(message);
        }
    }
}
