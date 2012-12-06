package com.ebanking.ws.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityLogManager {

    @Before("execution(* com.ebanking.ws.service.impl.security.UserLoginService.execute(..))")
    public void loginRequest(JoinPoint joinPoint) {
        Object[] paramValues = joinPoint.getArgs();
        System.out.println("LOGIN REQUEST");
    }

    @After("execution(* com.ebanking.ws.service.impl.security.UserLoginService.execute(..))")
    public void loginResponse(JoinPoint joinPoint) {
        System.out.println("LOGIN RESPONSE");
    }

}
