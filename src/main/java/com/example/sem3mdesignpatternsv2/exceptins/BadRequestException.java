package com.example.sem3mdesignpatternsv2.exceptins;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}