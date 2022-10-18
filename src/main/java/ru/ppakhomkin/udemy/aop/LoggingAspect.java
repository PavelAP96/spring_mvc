package ru.ppakhomkin.udemy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* ru.ppakhomkin.udemy.dao.*.*(..))")
    public Object aroundCrudMethodsAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Object targetMethodResult = null;
        System.out.println("Begin " + methodSignature.getMethod().getName());
        try {
             targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("Exception: " + throwable);
            throw throwable;
        }
        System.out.println("End " + methodSignature.getMethod().getName());
        return targetMethodResult;
    }
}
