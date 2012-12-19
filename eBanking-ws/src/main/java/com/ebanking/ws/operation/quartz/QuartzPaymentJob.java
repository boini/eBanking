package com.ebanking.ws.operation.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class QuartzPaymentJob extends QuartzJobBean {

    private PaymentPeekerService runMeTask;

    public void setRunMeTask(PaymentPeekerService runMeTask) {
        this.runMeTask = runMeTask;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        runMeTask.execute();
    }
}
