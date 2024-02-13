package com.evaluation.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class ConfigAspects {

    @Around("execution(* com.evaluation.demo.controller.ClientController.*(..))")
    public Object measureMethod(ProceedingJoinPoint pjp) throws Throwable
    {
        StopWatch sw = new StopWatch();
        Object retVal;
        try
        {
            sw.start(pjp.getTarget()+"."+pjp.getSignature());
            retVal = pjp.proceed();
        }
        catch (Throwable e)
        {
            throw e;
        }
        finally
        {
            sw.stop();
            System.out.println(sw.prettyPrint());
        }
        return retVal;
    }
}
