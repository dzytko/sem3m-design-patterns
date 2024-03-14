package com.example.sem3mdesignpatternsv2.utils.logging;

public enum LogLevel {
    DEBUG(0),
    INFO(1),
    WARNING(2),
    ERROR(3),
    CRITICAL(4);

    LogLevel(Integer value) {
        this.value = value;
    }

    private final Integer value;

    boolean isHigherPriority(LogLevel other) {
        return this.value <= other.value;
    }
}
