package com.ebanking.ws.operation.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 8:02 AM
 * To change this template use File | Settings | File Templates.
 */
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
