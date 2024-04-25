package com.example.sem3mdesignpatternsv2.utils.logging;

public class StdoutLoggerUpper extends StdoutLoggerImpl{
    @Override
    public void log(String message) {
        super.log(message.toUpperCase());
    }
}
