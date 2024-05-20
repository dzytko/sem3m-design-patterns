package com.example.sem3mdesignpatternsv2.utils.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpperAspect {

    @Pointcut("execution(public String com.example.sem3mdesignpatternsv2.utils.textModifiers.UpperModifier.modify(..))")
    public void upMethod() {}

    @AfterReturning(pointcut = "upMethod()", returning = "result")
    public void checkUpWord(Object result) {
        String uppedText = (String) result;
        System.out.println("Upped text from aspect: " + uppedText);
        if ("bad_words".equals(uppedText)) {
            throw new IllegalArgumentException("The upped word cannot be 'bad_words'");
        }
    }
}