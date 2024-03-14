package com.example.sem3mdesignpatternsv2.utils.logging;

public class StdoutLoggerFactory implements LoggerFactory{
    @Override
    public BaseLogger getLogger() {
        return new StdoutLoggerImpl();
    }
}
