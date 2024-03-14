package com.example.sem3mdesignpatternsv2.utils.logging;

public abstract class BaseLogger {
    protected abstract void log(String message);

    public void debug(String message) {
        log(message);
    }

    public void info(String message) {
        log(message);
    }

    public void warning(String message) {
        log(message);
    }

    public void error(String message) {
        log(message);
    }

    public void critical(String message) {
        log(message);
    }
}
