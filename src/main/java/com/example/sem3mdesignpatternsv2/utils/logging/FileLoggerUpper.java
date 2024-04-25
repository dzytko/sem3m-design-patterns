package com.example.sem3mdesignpatternsv2.utils.logging;

public class FileLoggerUpper extends FileLoggerImpl{
    public FileLoggerUpper(String filePath) {
        super(filePath);
    }

    @Override
    public void log(String message) {
        super.log(message.toUpperCase());
    }
}
