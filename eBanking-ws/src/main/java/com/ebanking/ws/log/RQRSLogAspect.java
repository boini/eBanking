package com.ebanking.ws.log;

import com.ebanking.ws.dao.AppLogDAO;
import com.ebanking.ws.model.AppLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class RQRSLogAspect {
    @Autowired
    private AppLogDAO appLogDAO;

    @Before("execution(* com.ebanking.ws.log.RQRSLogger.logRQRS(..))")
    public void rqrsLogging(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        //DEBUG
        System.out.println(args[0].toString());
        //END OF DEBUG

        String message = args[0].toString();
        String action = ((Class)args[1]).getName();

        AppLog appLog = new AppLog();
        appLog.setDate(new Date());
        appLog.setAction(action);
        appLog.setMessage(message);

        appLogDAO.saveOrUpdate(appLog);
    }

}
