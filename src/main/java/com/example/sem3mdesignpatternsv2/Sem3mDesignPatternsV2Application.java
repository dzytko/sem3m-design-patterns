package com.example.sem3mdesignpatternsv2;

import com.example.sem3mdesignpatternsv2.utils.FileLoggerFactory;
import com.example.sem3mdesignpatternsv2.utils.logging.*;
import com.example.sem3mdesignpatternsv2.utils.textModifiers.LowerModifier;
import com.example.sem3mdesignpatternsv2.utils.textModifiers.NoteModifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Sem3mDesignPatternsV2Application {

    public static void main(String[] args) {

        GenericApplicationContext ac = new GenericApplicationContext();
        ac.registerBean(NoteModifier.class, () -> new NoteModifier(new LowerModifier()));

        AppLoggerProvider.getInstance()
                .setLoggerChain(
                        new LoggerChainBuilder()
                                .addLogger(new FileLoggerFactory("main.log"))
                                .addLogger(new FileLoggerUpper("main_upper.log")) // Liskov
                                .addLogger(new StdoutLoggerFactory().getLogger())
                                .addLogger(new StdoutLoggerUpper()) // Liskov
                                .build()
                );

        SpringApplication.run(Sem3mDesignPatternsV2Application.class, args);
    }

}
