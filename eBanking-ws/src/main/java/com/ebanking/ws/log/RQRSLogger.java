package com.ebanking.ws.log;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 9:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class RQRSLogger {
    public static void logRequest(Object request, Class clazz) {
        Logger logger = Logger.getLogger(clazz);
        logger.info("[" + clazz.getName() + "] " + request);
    }
}
