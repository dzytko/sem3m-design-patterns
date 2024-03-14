package com.example.sem3mdesignpatternsv2.utils;

import com.example.sem3mdesignpatternsv2.utils.logging.BaseLogger;
import com.example.sem3mdesignpatternsv2.utils.logging.FileLoggerImpl;
import com.example.sem3mdesignpatternsv2.utils.logging.LoggerFactory;

public class FileLoggerFactory implements LoggerFactory {
    private final String filePath;
    public FileLoggerFactory(String filePath) {
        this.filePath = filePath;
    }

    public BaseLogger getLogger() {
        return new FileLoggerImpl(this.filePath);
    }
}
