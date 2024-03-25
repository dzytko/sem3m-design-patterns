package com.example.sem3mdesignpatternsv2.utils.logging;

import com.example.sem3mdesignpatternsv2.utils.patterns.Builder;

import java.util.HashSet;
import java.util.Set;

public class LoggerChainBuilder implements Builder<LoggerChain> {
    private final Set<BaseLogger> loggers = new HashSet<>();
    private final LogLevel logLevel;

    public LoggerChainBuilder(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LoggerChainBuilder() {
        this.logLevel = LogLevel.INFO;
    }

    public LoggerChainBuilder addLogger(BaseLogger logger) {
        loggers.add(new LoggerDecorator(logger, logLevel));
        return this;
    }
    public LoggerChainBuilder addLogger(LoggerFactory factory) {
        addLogger(factory.getLogger());
        return this;
    }
    @Override
    public LoggerChain build() {
        if (loggers.isEmpty()) {
            loggers.add(new StdoutLoggerFactory().getLogger());
        }
        return new LoggerChain(loggers);
    }
}
