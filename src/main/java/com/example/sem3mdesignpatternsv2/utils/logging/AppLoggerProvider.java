package com.example.sem3mdesignpatternsv2.utils.logging;

public class AppLoggerProvider {
    private static AppLoggerProvider instance;
    private LoggerChain loggerChain;

    private AppLoggerProvider() {
        loggerChain = new LoggerChainBuilder()
                .addLogger(new StdoutLoggerFactory())
                .build();
    }

    public void setLoggerChain(LoggerChain loggerChain) {
        this.loggerChain = loggerChain;
    }

    public LoggerChain getLoggerChain() {
        return loggerChain;
    }

    public static AppLoggerProvider getInstance() {
        if (instance == null) {
            instance = new AppLoggerProvider();
        }
        return instance;
    }

}
