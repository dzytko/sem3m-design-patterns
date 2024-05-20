package com.example.sem3mdesignpatternsv2.utils.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReverseAspect {

    @Pointcut("execution(public String com.example.sem3mdesignpatternsv2.utils.textModifiers.ReverseModifier.reverse(..))")
    public void reverseMethod() {}

    @AfterReturning(pointcut = "reverseMethod()", returning = "result")
    public void checkReversedWord(Object result) {
        String reversedText = (String) result;
        System.out.println("Reversed text from aspect: " + reversedText);
        if ("bad_words".equals(reversedText)) {
            throw new IllegalArgumentException("The reversed word cannot be 'bad_words'");
        }
    }
}