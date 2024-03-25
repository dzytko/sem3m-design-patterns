package com.example.sem3mdesignpatternsv2.utils.logging;

public class LoggerDecorator extends BaseLogger{
    private final BaseLogger logger;
    private final LogLevel logLevel;

    public LoggerDecorator(BaseLogger logger, LogLevel logLevel) {
        this.logger = logger;
        this.logLevel = logLevel;
    }

    @Override
    protected void log(String message) {

    }

    @Override
    public void debug(String message) {
        if (logLevel.isHigherPriority(LogLevel.DEBUG)) {
            logger.debug(message);
        }
    }

    @Override
    public void info(String message) {
        if (logLevel.isHigherPriority(LogLevel.INFO)) {
            logger.info(message);
        }
    }

    @Override
    public void warning(String message) {
        if (logLevel.isHigherPriority(LogLevel.WARNING)) {
            logger.warning(message);
        }
    }

    @Override
    public void error(String message) {
        if (logLevel.isHigherPriority(LogLevel.ERROR)) {
            logger.error(message);
        }
    }

    @Override
    public void critical(String message) {
        if (logLevel.isHigherPriority(LogLevel.CRITICAL)) {
            logger.critical(message);
        }
    }
}
