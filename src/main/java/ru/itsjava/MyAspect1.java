package ru.itsjava;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect1 {

    @Pointcut("execution(public * *(..))")
    public void publicMethod() {
    }

    @Pointcut("@annotation(ru.itsjava.Annotation1)")
    public void annotated() {
    }

    @Before("annotated() && publicMethod()")
    public void printABit() {
        System.out.println("Aspect1");
    }
}
