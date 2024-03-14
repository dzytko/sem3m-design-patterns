package com.example.sem3mdesignpatternsv2;

import com.example.sem3mdesignpatternsv2.utils.FileLoggerFactory;
import com.example.sem3mdesignpatternsv2.utils.logging.AppLoggerProvider;
import com.example.sem3mdesignpatternsv2.utils.logging.LoggerChainBuilder;
import com.example.sem3mdesignpatternsv2.utils.logging.StdoutLoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sem3mDesignPatternsV2Application {

    public static void main(String[] args) {

        AppLoggerProvider.getInstance()
                .setLoggerChain(
                        new LoggerChainBuilder()
                                .addLogger(new FileLoggerFactory("main.log"))
                                .addLogger(new StdoutLoggerFactory().getLogger())
                                .build()
                );

        SpringApplication.run(Sem3mDesignPatternsV2Application.class, args);
    }

}
