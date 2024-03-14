package com.example.sem3mdesignpatternsv2.utils.logging;

public class StdoutLoggerImpl extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
