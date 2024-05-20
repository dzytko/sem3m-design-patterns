package com.example.sem3mdesignpatternsv2.utils.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidatingAspect {

    @Pointcut("execution(public String com.example.sem3mdesignpatternsv2.utils.textValidator.TextValidator.validate(..))")
    public void validateMethod() {}

    @AfterReturning(pointcut = "validateMethod()", returning = "result")
    public void logValidatedWord(Object result) {
        Boolean validation_result = (Boolean) result;
        if (validation_result) {
            System.out.println("The word is valid");
        } else
        {
            System.out.println("The word is invalid");
        }
    }
}